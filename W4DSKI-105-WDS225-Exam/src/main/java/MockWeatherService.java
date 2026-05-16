package main.java;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class MockWeatherService implements WeatherService {

    private final Map<String, WeatherData> cache = new HashMap<>();
    private boolean serverAvailable = true;

    public void setServerAvailable(boolean available) {
        this.serverAvailable = available;
    }

    public void putInCache(String city, WeatherData data) {
        cache.put(city, data);
    }

    @Override
    public WeatherData fetchLive(String city) throws IOException {
        if (!serverAvailable) {
            throw new IOException("Service not reachable for: " + city);
        }

        return switch (city) {
            case "Berlin"  -> new WeatherData("Berlin",  18.5, "Bewölkt");
            case "Hamburg" -> new WeatherData("Hamburg", 15.2, "Regen");
            case "München" -> new WeatherData("München", 22.1, "Sonnig");
            default        -> throw new IOException("Unknown city: " + city);
        };
    }

    @Override
    public WeatherData fetchFromCache(String city) {
        return cache.get(city);
    }

}
