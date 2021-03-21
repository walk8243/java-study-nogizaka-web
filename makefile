.PHONY: build run logs

define APP_RUN
	@docker exec -d nogi-profile.web /bin/sh -c - "java -jar nogi-profile-web.jar >/var/log/nogi-profile.log 2>&1"
endef

build:
	docker build -t nogi-profile-web -f Dockerfile .

run:
	@docker exec nogi-profile.web sleep 5
	$(call APP_RUN)

logs:
	@docker exec nogi-profile.web tail /var/log/nogi-profile.log -n 200 -f
