FROM openjdk:17-oracle

# COPY target/

COPY target/springboot-cicd-0.0.1-SNAPSHOT.war /app.war


CMD ["java" , "-jar" , "/app.war"]
