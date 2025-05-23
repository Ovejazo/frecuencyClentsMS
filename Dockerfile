FROM openjdk:17
ARG JAR_FILE=./target7*.jar
COPY ${JAR_FILE} frecuencyClentsMS.jar
ENTRYPOINT ["java", "-jar", "/frecuencyClentsMS.jar"]