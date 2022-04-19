FROM openjdk:16
EXPOSE 8080
ADD target/ashishcicd.jar ashishcicd.jar
ENTRYPOINT ["java","-jar","ashishcicd.jar"]