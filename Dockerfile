FROM openjdk:11 AS worker

WORKDIR /usr/local/src
RUN apt update && apt install maven -y &&\
	mvn -version

WORKDIR /app
COPY pom.xml .
RUN mvn install -Dmaven.test.skip=true ; echo ""
COPY src/ src/
RUN mvn install -Dmaven.test.skip=true &&\
	mv target/nogi-profile-web-0.0.1-SNAPSHOT.jar nogi-profile-web.jar

FROM openjdk:11

WORKDIR /app
COPY --from=worker /app/nogi-profile-web.jar .

CMD [ "java", "-jar", "nogi-profile-web.jar" ]
