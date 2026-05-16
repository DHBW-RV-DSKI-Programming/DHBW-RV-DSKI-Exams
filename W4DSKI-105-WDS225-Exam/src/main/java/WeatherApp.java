package main.java;

import java.io.IOException;
import java.util.logging.Logger;

record WeatherData(String city, double temperature, String condition) {
}

interface WeatherService {

    WeatherData fetchLive(String city) throws IOException;

    WeatherData fetchFromCache(String city);

}

public class WeatherApp {

    private static final Logger LOGGER = Logger.getLogger(WeatherApp.class.getName());

    public static void main(String[] args) {
        MockWeatherService service = new MockWeatherService();
        service.putInCache("Berlin", new WeatherData("Berlin", 17.0, "Sonnig"));

        // TODO: Hier Aufgabe 3 implementieren
    }

    private static WeatherData getWeather(WeatherService service, String city) {
        // TODO: Hier Aufgabe 3 implementieren
        return null; // Platzhalter
    }

}
