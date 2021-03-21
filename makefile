.PHONY: build

build:
	docker build -t nogi-profile-web -f Dockerfile .
