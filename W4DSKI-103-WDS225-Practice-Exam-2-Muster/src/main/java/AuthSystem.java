package main.java;

class ApiToken {

    String key;
    long expiry;

    ApiToken(String key, long expiry) {
        this.key = key;
        this.expiry = expiry;
    }

    @Override // 1 Punkt
    public boolean equals(Object o) { // 1 Punkt
        if (this == o) return true; // 1 Punkt
        if (o == null || getClass() != o.getClass()) return false; // 1 Punkt
        ApiToken apiToken = (ApiToken) o; // 1 Punkt
        return this.key.equals(apiToken.key); // 1 Punkt
    }

}

public class AuthSystem {

    public static void main(String[] args) {
        ApiToken token1 = new ApiToken("VAULT_99", 5000L);
        ApiToken token2 = new ApiToken("VAULT_99", 1000L);

        if (token1.equals(token2)) { // 0,5 Punkte
            System.out.println("Access Granted: Tokens match."); // 0,5 Punkte
        }
    }

}

// Gesamtpunktzahl: 7 Punkte
