FROM gradle:jdk11 AS worker

WORKDIR /build
COPY build.gradle .
COPY settings.gradle .
RUN gradle build -x bootJar
COPY src/ src/
RUN gradle build -x test &&\
	cp build/libs/nogi-profile-web-*.jar nogi-profile-web.jar

FROM openjdk:11

WORKDIR /app
COPY --from=worker /build/nogi-profile-web.jar .

ENV SPRING_PROFILES_ACTIVE=docker

CMD [ "java", "-jar", "nogi-profile-web.jar" ]
