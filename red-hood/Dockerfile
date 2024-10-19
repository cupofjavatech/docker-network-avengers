#Java Runtime
FROM openjdk:17-jdk-slim

LABEL key="Cup Of Java Tech" 

WORKDIR /app

COPY target/red-hood-0.0.1-SNAPSHOT.jar /app/red-hood-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "red-hood-0.0.1-SNAPSHOT.jar" ]