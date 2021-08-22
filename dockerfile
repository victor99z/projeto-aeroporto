FROM openjdk:11
WORKDIR /app
COPY target/aeroporto-0.0.1-SNAPSHOT.jar /app/aeroporto.jar
ENTRYPOINT ["java", "-jar", "aeroporto.jar"]
EXPOSE 80