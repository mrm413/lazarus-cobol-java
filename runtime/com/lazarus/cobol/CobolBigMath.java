package com.lazarus.cobol;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * High-precision (33–50 digit) replacements for the transcendental math
 * intrinsics. libcob (GnuCOBOL) returns 33 significant digits with HALF_EVEN
 * rounding for SQRT/LOG/EXP/SIN/COS/TAN/ASIN/ACOS/ATAN/ANNUITY. Java's
 * `Math.*` returns `double` (≈15 digits), which produces wrong tails after
 * `MOVE FUNCTION SIN(x) TO Y` where Y is `PIC 9V9(35)`.
 *
 * Implementation uses Taylor series at 50-digit precision then rounds to 33.
 * Argument-reduction tricks (range reduction, log split) keep convergence
 * fast for typical COBOL inputs.
 */
public final class CobolBigMath {
    private CobolBigMath() {}

    /** Working precision — kept high to absorb cancellation in series sums. */
    public static final MathContext MC = new MathContext(60, RoundingMode.HALF_EVEN);
    /** Output precision — high enough for `PIC 9V9(35)` operands (36 sig figs).
     *  GnuCOBOL libcob also keeps ~38 digits internally for transcendental
     *  intrinsics; we round here instead of at the COBOL field boundary. */
    public static final MathContext OUT = new MathContext(40, RoundingMode.HALF_EVEN);

    public static final BigDecimal TWO   = BigDecimal.valueOf(2);
    public static final BigDecimal HALF  = new BigDecimal("0.5");
    public static final BigDecimal ONE   = BigDecimal.ONE;
    public static final BigDecimal ZERO  = BigDecimal.ZERO;

    /** π to 50 decimal places. */
    public static final BigDecimal PI = new BigDecimal(
        "3.14159265358979323846264338327950288419716939937510");
    /** π/2. */
    public static final BigDecimal PI_HALF = PI.divide(TWO, MC);
    /** π/4. */
    public static final BigDecimal PI_QUARTER = PI.divide(BigDecimal.valueOf(4), MC);
    /** e to 50 decimal places. */
    public static final BigDecimal E = new BigDecimal(
        "2.71828182845904523536028747135266249775724709369995");
    /** ln(2) to 50 decimal places. */
    public static final BigDecimal LN2 = new BigDecimal(
        "0.69314718055994530941723212145817656807550013436026");
    /** ln(10) to 50 decimal places. */
    public static final BigDecimal LN10 = new BigDecimal(
        "2.30258509299404568401799145468436420760110148862877");

    // ── SQRT ────────────────────────────────────────────────────────────
    public static BigDecimal sqrt(BigDecimal x) {
        if (x.signum() < 0) throw new ArithmeticException("SQRT of negative");
        if (x.signum() == 0) return ZERO;
        // Java 9+ has BigDecimal.sqrt — use it directly at MC precision.
        return x.sqrt(MC).round(OUT);
    }

    // ── LN / LOG / LOG10 ───────────────────────────────────────────────
    /** Natural log via range reduction: ln(x) = ln(2)*k + ln(y), y in [0.5, 1.0). */
    public static BigDecimal ln(BigDecimal x) {
        if (x.signum() <= 0) throw new ArithmeticException("LOG of non-positive");
        // Reduce to y in [1/sqrt(2), sqrt(2)] for fast convergence:
        //   x = 2^k * y, find k so y is close to 1.
        int k = 0;
        BigDecimal y = x;
        BigDecimal upper = sqrt(TWO);                 // ≈ 1.4142
        BigDecimal lower = ONE.divide(upper, MC);     // ≈ 0.7071
        while (y.compareTo(upper) > 0) { y = y.divide(TWO, MC); k++; }
        while (y.compareTo(lower) < 0) { y = y.multiply(TWO, MC); k--; }
        // ln(y) via the series ln((1+u)/(1-u)) = 2 * (u + u^3/3 + u^5/5 + …)
        // with u = (y-1)/(y+1). Converges quickly for y near 1.
        BigDecimal u = y.subtract(ONE).divide(y.add(ONE), MC);
        BigDecimal u2 = u.multiply(u, MC);
        BigDecimal sum = u;
        BigDecimal term = u;
        for (int n = 1; n < 200; n++) {
            term = term.multiply(u2, MC);
            BigDecimal add = term.divide(BigDecimal.valueOf(2L * n + 1), MC);
            sum = sum.add(add, MC);
            if (add.abs().compareTo(new BigDecimal("1e-52")) < 0) break;
        }
        sum = sum.multiply(TWO, MC);
        return sum.add(LN2.multiply(BigDecimal.valueOf(k), MC), MC).round(OUT);
    }

    public static BigDecimal log10(BigDecimal x) {
        return ln(x).divide(LN10, OUT);
    }

    // ── EXP ─────────────────────────────────────────────────────────────
    /** e^x via range reduction: x = k*ln(2) + r, |r| ≤ ln(2)/2; e^x = 2^k * e^r. */
    public static BigDecimal exp(BigDecimal x) {
        if (x.signum() == 0) return ONE;
        // k = round(x / ln(2))
        BigDecimal k_bd = x.divide(LN2, 0, RoundingMode.HALF_EVEN);
        long k = k_bd.longValueExact();
        BigDecimal r = x.subtract(LN2.multiply(BigDecimal.valueOf(k), MC), MC);
        // e^r via Taylor: 1 + r + r^2/2! + r^3/3! + …
        BigDecimal sum = ONE;
        BigDecimal term = ONE;
        for (int n = 1; n < 300; n++) {
            term = term.multiply(r, MC).divide(BigDecimal.valueOf(n), MC);
            sum = sum.add(term, MC);
            if (term.abs().compareTo(new BigDecimal("1e-55")) < 0) break;
        }
        // Multiply by 2^k
        BigDecimal pow2;
        if (k >= 0) pow2 = TWO.pow((int) k, MC);
        else        pow2 = ONE.divide(TWO.pow((int) -k, MC), MC);
        return sum.multiply(pow2, MC).round(OUT);
    }

    // ── SIN / COS / TAN ─────────────────────────────────────────────────
    /** Reduce x to [-π, π], then [-π/2, π/2] using sin/cos identities. */
    public static BigDecimal sin(BigDecimal x) {
        BigDecimal r = reduceTwoPi(x);
        // r in [-π, π]
        // sin(π - r) = sin(r) — reduce |r| > π/2 → |π - r| ≤ π/2
        if (r.compareTo(PI_HALF) > 0)               r = PI.subtract(r, MC);
        else if (r.compareTo(PI_HALF.negate()) < 0) r = PI.negate().subtract(r, MC);
        return sinSeries(r).round(OUT);
    }

    public static BigDecimal cos(BigDecimal x) {
        // cos(x) = sin(π/2 - x)
        return sin(PI_HALF.subtract(x, MC));
    }

    public static BigDecimal tan(BigDecimal x) {
        BigDecimal s = sin(x);
        BigDecimal c = cos(x);
        if (c.signum() == 0) throw new ArithmeticException("TAN at π/2 + kπ");
        return s.divide(c, OUT);
    }

    /** sin Taylor series — converges fast for |x| ≤ π/2. */
    private static BigDecimal sinSeries(BigDecimal r) {
        BigDecimal r2 = r.multiply(r, MC);
        BigDecimal sum = r;
        BigDecimal term = r;
        for (int n = 1; n < 200; n++) {
            // term *= -r^2 / ((2n)*(2n+1))
            term = term.multiply(r2, MC).negate();
            term = term.divide(BigDecimal.valueOf(2L * n * (2L * n + 1)), MC);
            sum = sum.add(term, MC);
            if (term.abs().compareTo(new BigDecimal("1e-55")) < 0) break;
        }
        return sum;
    }

    /** Reduce x mod 2π into [-π, π]. */
    private static BigDecimal reduceTwoPi(BigDecimal x) {
        BigDecimal twoPi = PI.multiply(TWO, MC);
        BigDecimal n = x.divide(twoPi, 0, RoundingMode.HALF_EVEN);
        BigDecimal r = x.subtract(twoPi.multiply(n, MC), MC);
        if (r.compareTo(PI) > 0) r = r.subtract(twoPi, MC);
        else if (r.compareTo(PI.negate()) < 0) r = r.add(twoPi, MC);
        return r;
    }

    // ── ASIN / ACOS / ATAN ─────────────────────────────────────────────
    /** atan via series: atan(x) = x - x^3/3 + x^5/5 - … (|x|<1) plus
     *  Euler reduction for |x| ≥ 1: atan(x) = π/2 - atan(1/x) for x > 0. */
    public static BigDecimal atan(BigDecimal x) {
        if (x.signum() == 0) return ZERO;
        if (x.abs().compareTo(ONE) >= 0) {
            BigDecimal inv = ONE.divide(x, MC);
            BigDecimal a = atanSeries(inv);
            BigDecimal half = PI_HALF;
            return (x.signum() > 0 ? half.subtract(a, MC) : half.negate().subtract(a, MC)).round(OUT);
        }
        return atanSeries(x).round(OUT);
    }

    private static BigDecimal atanSeries(BigDecimal x) {
        // Use 2*atan(x/(1+sqrt(1+x²))) for faster convergence
        // (halves the argument; atan(x) = 2 * atan(x/(1+sqrt(1+x²))))
        BigDecimal tmp = ONE.add(x.multiply(x, MC), MC);
        BigDecimal denom = ONE.add(sqrt(tmp), MC);
        BigDecimal y = x.divide(denom, MC);
        BigDecimal y2 = y.multiply(y, MC);
        BigDecimal sum = y;
        BigDecimal term = y;
        for (int n = 1; n < 400; n++) {
            term = term.multiply(y2, MC).negate();
            BigDecimal add = term.divide(BigDecimal.valueOf(2L * n + 1), MC);
            sum = sum.add(add, MC);
            if (add.abs().compareTo(new BigDecimal("1e-55")) < 0) break;
        }
        return sum.multiply(TWO, MC);
    }

    /** asin(x) = atan(x / sqrt(1-x²))  for |x| < 1; asin(±1) = ±π/2. */
    public static BigDecimal asin(BigDecimal x) {
        int cmp = x.abs().compareTo(ONE);
        if (cmp > 0) throw new ArithmeticException("ASIN out of range");
        if (cmp == 0) return x.signum() > 0 ? PI_HALF.round(OUT) : PI_HALF.negate().round(OUT);
        BigDecimal denom = sqrt(ONE.subtract(x.multiply(x, MC), MC));
        return atan(x.divide(denom, MC));
    }

    /** acos(x) = π/2 - asin(x). */
    public static BigDecimal acos(BigDecimal x) {
        return PI_HALF.subtract(asin(x), MC).round(OUT);
    }

    // ── ANNUITY ─────────────────────────────────────────────────────────
    /** FUNCTION ANNUITY: present-value annuity factor.
     *  ANNUITY(rate, periods) = rate / (1 - (1+rate)^(-periods))
     *  When rate is 0: returns 1/periods. */
    public static BigDecimal annuity(BigDecimal rate, BigDecimal periods) {
        if (rate.signum() == 0) return ONE.divide(periods, OUT);
        // (1+rate)^(-periods) = exp(-periods * ln(1+rate))
        BigDecimal onePlusRate = ONE.add(rate, MC);
        BigDecimal lnOpr = ln(onePlusRate);
        BigDecimal expArg = periods.negate().multiply(lnOpr, MC);
        BigDecimal denom = ONE.subtract(exp(expArg), MC);
        return rate.divide(denom, OUT);
    }
}
