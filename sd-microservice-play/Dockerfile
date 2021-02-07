FROM openjdk:11
EXPOSE 8012
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} myapp.jar
ENTRYPOINT ["java","-jar","/myapp.jar"]
