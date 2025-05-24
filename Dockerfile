FROM openjdk:17
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} frecuencyClentsMS.jar
ENTRYPOINT ["java", "-jar", "/frecuencyClentsMS.jar"]