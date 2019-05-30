FROM openjdk:8-jdk-alpine

COPY . /usr/app

WORKDIR /usr/app

RUN apk add maven

RUN mvn test

RUN mvn package

ENTRYPOINT ["java","-jar","target/java-demo-app-0.1.0.jar"]
