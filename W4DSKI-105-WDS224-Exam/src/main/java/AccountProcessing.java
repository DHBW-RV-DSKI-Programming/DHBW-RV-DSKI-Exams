package main.java;

import java.util.List;

record UserAccount(String username, String mail) {}

public class AccountProcessing {

    public static void main(String[] args) {
        List<UserAccount> userAccounts = List.of(
                new UserAccount("alice", "alice@example.com"),
                new UserAccount("bob", "bob@gmail.com"),
                new UserAccount("carla", "carla@gmail.com"),
                new UserAccount("daniel", "daniel@company.com"),
                new UserAccount("eve", "eve@gmail.com"),
                new UserAccount("frank", "frank@example.com"),
                new UserAccount("alice", "alice2@example.com"),
                new UserAccount("george", "george@gmail.com"),
                new UserAccount("bob", "bob2@example.com"),
                new UserAccount("helen", "helen@gmail.com")

        );

        // TODO: Hier Aufgabe 3 implementieren
    }

}
