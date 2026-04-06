package main.java;

import java.util.Random;
import java.util.stream.Stream;

record Doctor(String name, int age) {}

public class InfinityStream {

    public static void main(String[] args) {
        String[] names = {"House", "Murphy", "Wilson", "Chase", "Foreman", "Lim", "Andrews", "Melendez"};

        Stream<Doctor> doctors = Stream.iterate(1, n -> n + 1)
//                .limit(10) // 2 Punkte
                .map(_ -> new Doctor(names[new Random().nextInt(names.length)], new Random().nextInt(100)));

        doctors.forEach(System.out::println);
    }

}

// Gesamtpunktzahl: 2 Punkte