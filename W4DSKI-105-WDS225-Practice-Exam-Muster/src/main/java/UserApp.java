package main.java;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

record User (int id, String name) {

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof User user) {
            return Objects.equals(this.name, user.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(name.hashCode());
    }

}

class UserRegistry {

//    private final List<User> users = new ArrayList<>();
    private final Set<User> users = new HashSet<>(); // 1,5 Punkte

    public void addUser(User user) {
        users.add(user);
    }

//    public List<User> getUsers() {
    public Set<User> getUsers() { // 1,5 Punkte
        return users;
    }

}

public class UserApp {

    public static void main(String[] args) {
        UserRegistry registry = new UserRegistry();
        registry.addUser(new User(1, "Diego"));
        registry.addUser(new User(2, "Milten"));
        registry.addUser(new User(3, "Lester"));
        registry.addUser(new User(4, "Gorn"));
        registry.addUser(new User(5, "Gomez"));
        registry.addUser(new User(6, "Innos"));
        registry.addUser(new User(7, "Lester"));
        registry.addUser(new User(8, "Saturas"));
        registry.addUser(new User(9, "Xardas"));
        registry.addUser(new User(10, "Milten"));
        registry.addUser(new User(11, "Vatras"));

        System.out.println(registry.getUsers());
        System.out.println(registry.getUsers().size());
    }

}

// Gesamtpunktzahl: 3 Punkte