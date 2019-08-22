FROM openjdk:10-jre-slim
COPY target/proyectofinal-backend-apirest-0.0.1-SNAPSHOT.jar .

EXPOSE 8080
CMD ["java", "-jar", "proyectofinal-backend-apirest-0.0.1-SNAPSHOT.jar"]