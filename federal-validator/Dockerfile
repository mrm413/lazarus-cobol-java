FROM ubuntu:22.04

ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_HOME=/usr/lib/jvm/java-21-openjdk-amd64

# Install OpenJDK 21, GnuCOBOL 3.2, and build tools
RUN apt-get update && \
    apt-get install -y --no-install-recommends \
        openjdk-21-jdk-headless \
        gnucobol3 \
        bc \
        diffutils \
        coreutils \
        bash \
    && rm -rf /var/lib/apt/lists/*

# Verify installations
RUN java -version 2>&1 && cobc --version 2>&1 | head -1

WORKDIR /validator

# Copy runtime library source
COPY runtime/ /validator/runtime/

# Copy transpiled Java output
COPY generated/ /validator/generated/

# Copy original COBOL source for comparison
COPY cobol-source/ /validator/cobol-source/

# Copy golden expected outputs from GnuCOBOL federal test suite
COPY golden-outputs/ /validator/golden-outputs/

# Copy test runner scripts
COPY test_runner.sh /validator/test_runner.sh
COPY parity_harness.sh /validator/parity_harness.sh
COPY run.sh /validator/run.sh
COPY known_issues.txt /validator/known_issues.txt
COPY FIXES_APPLIED.md /validator/FIXES_APPLIED.md

RUN chmod +x /validator/test_runner.sh /validator/parity_harness.sh /validator/run.sh
RUN sed -i 's/\r$//' /validator/test_runner.sh /validator/parity_harness.sh /validator/run.sh

# Pre-compile runtime into JAR for fast per-test compilation
RUN mkdir -p /validator/build && \
    javac -d /validator/build /validator/runtime/com/lazarus/cobol/*.java && \
    javac -cp /validator/build -d /validator/build /validator/runtime/com/lazarus/cobol/jcl/batch/*.java && \
    cd /validator/build && \
    jar cf /validator/lazarus-runtime.jar com/ && \
    echo "Runtime JAR built: $(du -h /validator/lazarus-runtime.jar | cut -f1)"

ENTRYPOINT ["/validator/run.sh"]
