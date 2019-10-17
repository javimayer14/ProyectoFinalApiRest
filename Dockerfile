
FROM maven:3.5.2-jdk-8-alpine
COPY ./ .
WORKDIR ./
RUN mvn clean package -DskipTests
RUN apk update && \
    apk add mysql-client


EXPOSE 8080
CMD ["java", "-jar", "target/proyectofinal-backend-apirest-0.0.1-SNAPSHOT.jar"]