.PHONY: build run test single report parity parity-report clean help

help:
	@echo ""
	@echo "Lazarus COBOL-to-Java Validator"
	@echo "================================"
	@echo ""
	@echo "  make build            Build the Docker image"
	@echo "  make run              Run full validation (compile + compare)"
	@echo "  make test             Run compile-only validation (faster)"
	@echo "  make parity           Run federal parity proof (281 tests, side-by-side)"
	@echo "  make single T=name    Run a single test by partial name"
	@echo "  make report           Run full validation and save report"
	@echo "  make clean            Remove Docker image and build artifacts"
	@echo ""

build:
	docker build -t lazarus-java-validator .

run: build
	docker run --rm lazarus-java-validator

test: build
	docker run --rm lazarus-java-validator --compile-only

parity: build
	docker run --rm lazarus-java-validator --parity

single: build
	docker run --rm lazarus-java-validator --test "$(T)"

report: build
	docker run --rm -v "$(PWD)/validation-report.txt:/validator/validation-report.txt" lazarus-java-validator --report --compile-only

clean:
	docker rmi lazarus-java-validator 2>/dev/null || true
	rm -f validation-report.txt
