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

        WeatherData result = getWeather(service, "Berlin"); // 0,5 Punkte
        System.out.println(result); // 0,5 Punkte

        service.setServerAvailable(false); // 0,5 Punkte
        WeatherData cached = getWeather(service, "Berlin"); // 0,5 Punkte
        System.out.println(cached); // 0,5 Punkte

        WeatherData fallBack = getWeather(service, "Hamburg"); // 0,5 Punkte
        System.out.println(fallBack); // 0,5 Punkte
    }

    private static WeatherData getWeather(WeatherService service, String city) {
        try { // 0,5 Punkte
            return service.fetchLive(city); // 1 Punkt
        } catch (IOException e) { // 1 Punkt
            WeatherData cached = service.fetchFromCache(city); // 1 Punkt
            if (cached != null) { // 1 Punkt
                return cached; // 1 Punkt
            }

            LOGGER.warning("No weather data available for " + city + ", returning fallback"); // 1 Punkt
            return new WeatherData(city, 0.0, "Wolkig mit Aussicht auf Fleischbällchen"); // 1 Punkt
        }
    }

}

// Gesamtpunktzahl: 11 Punkte