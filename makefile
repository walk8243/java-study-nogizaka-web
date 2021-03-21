.PHONY: build run logs

build:
	docker build -t nogi-profile-web -f Dockerfile .

run:
	@docker exec nogi-profile.web sleep 1

logs:
	@docker logs nogi-profile.web -f
