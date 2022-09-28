FROM openjdk:11-slim as build
MAINTAINER jerome
COPY target/practice-0.0.1-SNAPSHOT.jar practice-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/practice-0.0.1-SNAPSHOT.jar" ]

