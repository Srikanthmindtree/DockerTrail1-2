FROM openjdk:17
MAINTAINER DockerTrail1-2
COPY target/DockerTrail1-2-0.0.1-SNAPSHOT.jar DockerTrail1-2-0.0.1-SNAPSHOT.jar
EXPOSE 8013
CMD ["java" "-jar" "DockerTrail1-2.jar"]