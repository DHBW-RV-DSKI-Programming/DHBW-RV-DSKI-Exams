# W4DSKI-105-WDS225-Exam

Maximale Punktzahl: 50 Punkte

Dauer: 60 Minuten

Dozent: Mario Pfob

## Teil 1 (20 Punkte)

### Aufgabe 1 – Produktbestimmung (8 Punkte)

Gegeben ist ein **record** `Product` mit den Feldern `name`, `category`, `price` und `stock`.
Eine Liste mit Produkten ist im Code vorgegeben.

Implementieren Sie die Methode `getTopProducts(List<Product> products)` in der Klasse `ProductApp`, welche folgende Schritte mittels der **Stream-API** durchführt:

1. Erstellen Sie einen **Stream** aus der Produktliste.
2. **Filtern** Sie die Produkte so, dass nur Produkte der Kategorie _"Electronics"_ mit einem Lagerbestand **größer als 0** verbleiben.
3. **Sortieren** Sie die verbleibenden Produkte **absteigend** nach dem Preis.
4. **Mappen** Sie jedes Produkt in einen String der Form `"Name (Preis€)"`.
5. **Sammeln** Sie die Ergebnisse in einer `List<String>` und geben Sie diese zurück.

<u>Erwartete Ausgabe:</u>

```
[Laptop (1200.0€), Monitor (400.0€)]
```

### Aufgabe 2 – File-Merger (12 Punkte)

Im Verzeichnis `data/` befinden sich drei Textdateien: `words1.txt`, `words2.txt` und `words3.txt`.
Jede Datei enthält eine Liste von Wörtern – eines pro Zeile, ggf. mit Leerzeilen dazwischen.

Implementieren Sie die Methode `mergeFiles(List<Path> paths)` in der Klasse `FileMerger`, welche folgende Schritte ausführt:

1. Erstellen Sie eine leere `List<String>`, in der alle gelesenen Wörter gesammelt werden.
2. Iterieren Sie über alle übergebenen `Path`-Objekte.
3. Lesen Sie den Inhalt jeder Datei **zeilenweise** ein.
4. Iterieren Sie über alle eingelesenen Zeilen.
5. Ignorieren Sie dabei Zeilen, die **leer** sind oder nur aus **Leerzeichen** bestehen.
6. Fügen Sie jede gültige Zeile **ohne führende oder nachfolgende Leerzeichen** der Gesamtliste hinzu.
7. Geben Sie alle gesammelten Wörter als einen **einzigen** String zurück, bei dem die Einträge durch `"; "` getrennt sind.

<u>Hinweis:</u> Die Methode deklariert throws `IOException` – eine explizite Fehlerbehandlung ist **nicht** erforderlich.

<u>Erwartete Ausgabe: </u>

```
Lover; Red; Folklore; 1989; Evermore; Speak Now; Midnights
```

## Teil 2 (20 Punkte)

### Aufgabe 3 – Wetterfrosch (11 Punkte)

Gegeben sind folgende Typen, welche vollständig implementiert sind und **nicht** verändert werden dürfen:

- record `WeatherData` – repräsentiert Wetterdaten einer Stadt.
- interface `WeatherService` mit den zwei Methoden:
  - `fetchLive` – ruft Live-Daten vom Server ab.
  - `fetchFromCache` – liefert gecachte Daten oder `null`.
- `MockWeatherService` – eine Implementierung, die einen Server simuliert.
Der Server kann mit `setServerAvailable(false)` deaktiviert werden.

Implementieren Sie die Methode `getWeather(WeatherService service, String city)` mit folgender **Fallback**-Strategie:
  
- Versuchen Sie zunächst, **Live**-Wetterdaten abzurufen und zurückzugeben.
- Schlägt der Abruf fehl, prüfen Sie, ob für die Stadt **gecachte** Daten vorliegen, und geben Sie diese zurück.
- Sind auch keine gecachten Daten vorhanden, loggen Sie eine **Warnung** über den vorhandenen `LOGGER` und geben Sie ein **Fallback-WeatherData-Objekt** mit `Temperatur 0.0` und der Wetterlage `"Wolkig mit Aussicht auf Fleischbällchen"` für die jeweilige Stadt zurück.

Stellen Sie in der `main`-Methode der Klasse `WeatherApp` dar, wie alle drei Szenarien (Live, Cache, Fallback) ablaufen.
Nutzen Sie für das Simulieren von Fehlern den Methodenaufruf `service.setServerAvailable(false)`.

### Aufgabe 4 – IMDb (9 Punkte)

Gegeben ist der **record** `Movie` mit den Feldern `movieId`, `movieName` und `rating`.
Eine Liste mit folgenden Filmen ist bereits im Code vorgegeben, diese Zeilen dürfen <u>nicht</u> modifiziert werden:

```java
List<Movie> movies = List.of(
        new Movie("O1", "Good Will Hunting", 10.0),
        new Movie("O2", "Batman Begins", 8.2),
        new Movie("O3", "Moneyball", 7.6),
        new Movie("O4", "Ballerina",  6.8),
        new Movie("O5", "Good Will Hunting", 8.4),
        new Movie("O6", "Ballerina", 9.0),
        new Movie("O7", "Notting Hill", 8),
        new Movie("O8", "The King's Speech", 9)
);
```

Implementieren Sie die Methode `getUniqueMovieNamesSorted(List<Movie> movies)` in der Klasse `ImdbApp`,
welche alle <u>**eindeutigen**</u> **Filmtitel** aus der Liste **alphabetisch <u>sortiert**</u> zurückgibt.
Wählen Sie hierzu eine **geeignete Datenstruktur**.

Geben Sie das Ergebnis in der `main`-Methode aus.

## Teil 3 (10 Punkte)

### Aufgabe 5 – Palindrom-Prüfung (8 Punkte)

Implementieren Sie die Methode `isPalindrome()`, die **rekursiv** prüft, ob ein gegebener String ein **Palindrom** ist.
Groß- und Kleinschreibung sollen dabei ignoriert werden.

> Ein Palindrom ist ein Wort, das vorwärts wie rückwärts gelesen identisch ist (z.B. "_Racecar"_, _"Madam"_).

Die Lösung muss zwingend **rekursiv** sein — iterative Lösungen oder die Verwendung von `StringBuilder.reverse()` werden nicht gewertet.

### Aufgabe 6 – LogWriter (2 Punkte)

Gegeben ist die Klasse `LogWriter`, welche eine Liste von Log-Einträgen in die Datei `data/server.log` schreiben soll.
Die Methode `writeLog` enthält jedoch einen **Bug**, welcher verhindert, dass die **komplette** Log-Liste **korrekt** in die Datei geschrieben wird.

Identifizieren Sie den **Bug** und korrigieren Sie ihn.
Sie dürfen Modifikationen an der Methode `writeLog` vornehmen.