FROM maven:3.8.4-jdk-11
COPY . .
#RUN mvn clean install && ls -R
ADD target/user_service-0.0.1-SNAPSHOT.jar userapp.jar
ENTRYPOINT ["java", "-jar", "userapp.jar"]
