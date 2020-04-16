FROM adoptopenjdk/openjdk11

RUN mkdir /app

WORKDIR /app

COPY target/docker-demo-0.0.1-SNAPSHOT.jar docker-demo-exec.jar

CMD exec java -jar docker-demo-exec.jar