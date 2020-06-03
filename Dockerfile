FROM babinbaburajan/queue-openrepo:ayemaven

MAINTAINER babi4babin@gmail.com

COPY pom.xml /tmp/
COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

EXPOSE 8081
CMD java -jar /tmp/target/dockerized-spring-0.0.1-SNAPSHOT.jar