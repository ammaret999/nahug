FROM maven:3.8.4-openjdk-17

COPY . .

RUN mvn package

ENTRYPOINT ["java","-jar","/target/nahug-0.0.3.jar"]