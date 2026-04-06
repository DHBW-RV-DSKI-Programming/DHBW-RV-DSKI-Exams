package main.java;

class ApiToken {

    String key;
    long expiry;

    ApiToken(String key, long expiry) {
        this.key = key;
        this.expiry = expiry;
    }

}

public class AuthSystem {

    public static void main(String[] args) {
        ApiToken token1 = new ApiToken("VAULT_99", 5000L);
        ApiToken token2 = new ApiToken("VAULT_99", 1000L);

        // TODO: Hier Aufgabe 3 implementieren
    }

}

