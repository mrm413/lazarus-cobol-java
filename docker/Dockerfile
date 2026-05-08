FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64

# Install OpenJDK 21, GnuCOBOL 3.2, and minimal build tools.
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        openjdk-21-jdk-headless \
        gnucobol3 \
        diffutils \
        coreutils \
        bash \
    && rm -rf /var/lib/apt/lists/*

# Sanity check: print versions so the build log proves what we have.
RUN java -version 2>&1 && cobc --version 2>&1 | head -1

WORKDIR /validator

# Copy the runtime library, the 723 generated Java programs, the original
# COBOL source files (used only for the optional --full mode), and the
# golden reference stdout captures.
COPY runtime/        /validator/runtime/
COPY generated/      /validator/generated/
COPY cobol-source/   /validator/cobol-source/
COPY golden-outputs/ /validator/golden-outputs/

# Copy the validation harness and entry point.
COPY docker/run.sh             /validator/run.sh
COPY docker/parity_harness.sh  /validator/parity_harness.sh
COPY docker/full_harness.sh    /validator/full_harness.sh

RUN chmod +x /validator/run.sh /validator/parity_harness.sh /validator/full_harness.sh && \
    sed -i 's/\r$//'  /validator/run.sh /validator/parity_harness.sh /validator/full_harness.sh

# Pre-compile the runtime into a JAR so per-program compilation only has to
# include the single jar on the classpath, not 40+ source files.
RUN mkdir -p /validator/build && \
    find /validator/runtime -name '*.java' > /validator/runtime_sources.txt && \
    javac -d /validator/build @/validator/runtime_sources.txt && \
    cd /validator/build && \
    jar cf /validator/lazarus-runtime.jar com/ && \
    rm -rf /validator/build /validator/runtime_sources.txt && \
    echo "Runtime JAR built: $(du -h /validator/lazarus-runtime.jar | cut -f1)"

ENTRYPOINT ["/validator/run.sh"]
