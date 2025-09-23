FROM amazoncorretto:21-alpine-jdk

# Hilfstools installieren
RUN apk add --no-cache curl

# Arbeitsverzeichnis im Container
WORKDIR /app

# Script und JAR ins Image kopieren
COPY entrypoint.sh /app/entrypoint.sh
COPY target/EulerSpring-0.0.1-SNAPSHOT.jar /app/app.jar

# Script ausführbar machen
RUN chmod +x /app/entrypoint.sh
RUN chmod +x /app/app.jar


# Port im Container bekannt machen (z. B. Spring Boot Standardport)
EXPOSE 8080

# Start up Invoice-Service
ENTRYPOINT [ "/bin/sh" ]
CMD [ "/app/entrypoint.sh" ]