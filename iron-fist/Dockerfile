#Java Runtime
FROM openjdk:17-jdk-slim

LABEL key="Cup Of Java Tech" 

WORKDIR /app

COPY target/iron-fist-0.0.1-SNAPSHOT.jar /app/iron-fist-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "iron-fist-0.0.1-SNAPSHOT.jar" ]