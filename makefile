.PHONY: init build run reload logs

define ECLIPSE_LOAD
	@.\gradlew eclipse
endef

init:
	$(call ECLIPSE_LOAD)

build:
	docker build -t nogi-profile-web -f Dockerfile .

run:
	@docker exec nogi-profile.web sleep 1

reload:
	$(call ECLIPSE_LOAD)

logs:
	@docker logs nogi-profile.web -f
