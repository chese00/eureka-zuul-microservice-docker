FROM openjdk:11
ADD target/docker-netflix-greeting-microservice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djavarc.security.egd=file:/dev/./urandom","-jar","/app.jar"]