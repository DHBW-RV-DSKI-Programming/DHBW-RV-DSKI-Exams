package main.java;

import java.util.List;

record Server(String name, int port, long uptimeInDays) {}

public class ServerManager {

    public static void main(String[] args) {
        List<Server> servers = List.of(
                new Server("web-prod-01", 80,  412),
                new Server("web-prod-02", 80,  398),
                new Server("web-staging", 8080, 45),
                new Server("api-gateway",    443, 300),
                new Server("api-auth",       443, 280),
                new Server("api-payments",   443, 260),
                new Server("api-fhir",       8080, 190),
                new Server("db-postgres-primary", 5432, 500),
                new Server("db-postgres-replica", 5432, 499),
                new Server("db-redis-cache",      6379, 350),
                new Server("db-mongo-01",         27017, 210),
                new Server("kafka-broker-01", 9092, 180),
                new Server("kafka-broker-02", 9092, 178),
                new Server("rabbitmq-main",   5672, 220),
                new Server("grafana",      3000, 150),
                new Server("prometheus",   9090, 149),
                new Server("elasticsearch",9200, 160),
                new Server("jenkins-main", 8080, 365),
                new Server("sonarqube",    9000,  90),
                new Server("nexus-repo",   8081, 200)
        );

        // TODO: Hier Aufgabe 4 implementieren
    }

}