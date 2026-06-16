package main.java;

import java.util.List;


public class SolarSystem {

    public record Planet(String name, int moons, long distanceFromSunKm) {}

    public static void main(String[] args) {
        List<Planet> planets = List.of(
                new Planet("Saturn",   146, 1_432_000_000L),
                new Planet("Mars",     2,   227_900_000L),
                new Planet("Earth",    1,   149_600_000L),
                new Planet("Jupiter",  95,  778_500_000L),
                new Planet("Neptune",  16,  4_515_000_000L),
                new Planet("Venus",    0,   108_200_000L),
                new Planet("Mercury",  0,    57_900_000L),
                new Planet("Uranus",   28,  2_867_000_000L)
        );

        Planet closest = findClosest(planets, 1, planets.getFirst()); // 1 Punkt
        System.out.println("Closest planet to the Sun: " + closest.name()); // 0,5 Punkte
    }

    public static Planet findClosest(List<Planet> planets, int index, Planet closest) { // 1 Punkt
        if (index == planets.size()) { // 0,5 Punkte
            return closest; // 0,5 Punkte
        }
        Planet current = planets.get(index); // 0,5 Punkte
        Planet newClosest = current.distanceFromSunKm() < closest.distanceFromSunKm() ? current : closest; // 2 Punkte
        return findClosest(planets, index + 1, newClosest); // 2 Punkte
    }

}

// Gesamtpunktzahl: 8 Punkte