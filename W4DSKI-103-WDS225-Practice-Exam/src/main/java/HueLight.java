package main.java;

public record HueLight(
    String id,
    String name,
    boolean isOn,
    int brightness,
    String color
) {
}
