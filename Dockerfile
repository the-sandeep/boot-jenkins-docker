FROM openjdk:11
EXPOSE 8080
ADD target/boot-jenkins-docker.jar boot-jenkins-docker.jar
ENTRYPOINT ["java","-jar","/boot-jenkins-docker.jar"]