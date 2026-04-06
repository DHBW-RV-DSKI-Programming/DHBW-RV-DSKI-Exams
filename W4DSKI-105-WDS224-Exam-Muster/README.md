# W4DSKI-105-WDS224-Exam

Maximale Punktzahl: 50 Punkte

Dauer: 60 Minuten

Dozent: Mario Pfob

## Teil 1 (20 Punkte)

### Aufgabe 1 – Dateien aufräumen (6 Punkte)

In der Klasse `KehrwocheApp` sollen alle hundert TXT-Dateien im Ordner `data` gelöscht werden.
Vervollständige die `main`-Methode, um jede der hundert TXT-Dateien im `data`-Ordner zu löschen.
Prüfe <u>vor</u> jeder Löschung, ob die Datei noch existiert – falls nicht, überspringe diese.
Gebe beim Löschen jeder Datei auf dem Terminal aus, ob diese Operation erfolgreich war.
Allgemein muss die Ausgabe wie folgt aussehen:

```
<Dateiname> deleted: <Ergebnis Datei-Operation>
```

Eine beispielhafte Ausgabe sieht wie folgt aus:

```
file0.txt deleted: true
```

### Aufgabe 2 – IMDb-Bewertungen (14 Punkte)

In der Klasse `ImdbApp` sollen Bewertungen von Filmen erfasst und abgefragt werden.
Erfülle dazu die folgenden Teilaufgaben:

1. Finde eine passende Datenstruktur, um auf schnellstem Wege zu jedem Filmnamen (`String`) die entsprechende Bewertung (`Double`) speichern zu können.
   1. Speichere anschließend in einer Variable mit dem Typ dieser Datenstruktur folgende Eigenschaften:
      - `"Fight Club"` mit einer Bewertung von `8.8`
      - `"How to Train Your Dragon"` mit einer Bewertung von `8.1`
2. Implementiere die Methode `findMovieRating`, welche als Parameter die Sammlung von Film-Bewertungen und den gesuchten Filmnamen entgegennimmt.
Zurückgegeben wird die Film-Bewertung.
3. Der Rückgabewert der Methode wird genutzt, um eine Ausgabe auf dem Terminal zu ermöglichen, welche wie folgt aussieht:
`Rating of 'Fight Club': 8.8`
4. Erweitere die Methode `findMovieRating`, um eine Abfrage, ob der Filmname in der Sammlung existiert.
Sollte der Filmname in der Sammlung nicht existieren, wird die _custom_ Exception vom Typ `MovieNotFoundException` geworfen.
   1. Implementiere `MovieNotFoundException`.
   Zusätzlich zur Fehlermeldung, soll der Filmname im Konstruktor übergeben und als Attribut in der Klasse gespeichert werden.
   Ergänze anschließend die `MovieNotFoundException`-Klasse um folgenden gegebenen Getter: `String getMovieName() { return movieName; }`
5. Die Methode `findMovieRating` wirft die `MovieNotFoundException` lediglich weiter.
In der `main`-Methode wird die `MovieNotFoundException` aufgefangen.
Im Handling des Fehlerfalls wird zuerst die Fehlermeldung auf dem Terminal ausgegeben.
Anschließend wird der Getter `getMovieName` aufgerufen, um den Filmnamen mit der Initialbewertung von `0.0` der Sammlung hinzuzufügen.
6. Führe die Abfrage der Sammlung auf folgende Filmnamen aus: `"Fight Club"` und `"Saving Private Ryan"`.
Am Ende muss folgende Ausgabe auf dem Terminal erfolgen:

```
Rating of 'Fight Club': 8.8
Warning: Movie 'Saving Private Ryan' not found
```

## Teil 2 (20 Punkte)

### Aufgabe 3 – Datenprozessierung von Benutzerkonten (7 Punkte)

In der Klasse `AccountProcessing` soll eine kleine Datenprozessierungsstrecke abgebildet werden.
Zu Beginn sind beispielhafte `UserAccount`-Objekte gegeben, welche in der Liste `userAccounts` gespeichert werden.
Die Aufgabe ist es, die Elemente in der Liste zu prozessieren.
Dazu müssen folgende Schritte in der Reihenfolge beachtet werden:

1. Es werden lediglich Elemente beachtet, welche auf `"@gmail.com"` enden
2. Es findet ein Mapping auf das Attribut `username` statt
3. Anschließend wird die Liste um Dubletten bereinigt, es bleiben sogenannte _distinct values_ übrig.
4. Darauf folgend werden die aktuell verbleibenden Elemente sortiert (alphabetisch)
5. Von den sortierten Elementen werden die ersten drei Elemente beachtet
6. Zuletzt werden die drei `username`-Elemente auf dem Terminal ausgegeben. Die Ausgabe muss wie folgt aussehen:

```
bob
carla
eve
```

### Aufgabe 4 – Reihenfolge von Songs (13 Punkte)

In `MusicLibraryApp` werden durch die Methode `generateSongs` einige der bekannten Hits des vergangenen Jahrtausends erstellt.
Diese `Song`-Objekte sollen in einer Liste gesammelt auf zwei Möglichkeiten sortiert werden.

1. Implementiere das `Comparable`-Interface, um die `Song`-Objekte nach dem Attribut `popularity` absteigend zu sortieren (höchste Beliebtheit zu Beginn).
2. Implementiere das `Comparator`-Interface (nenne die Klasse `SongComparator`), um die `Song`-Objekte nach drei Bedingungen zu sortieren:
   1. Zuerst nach dem Attribut `year` in absteigender Reihenfolge
   2. Sekundär nach dem Attribut `artist` in alphabetischer Reihenfolge
   3. Tertiär nach dem Attribut `title` in alphabetischer Reihenfolge

Implementiere beide Sortierungen, sodass die Ausgabe der `Song`-Objekte im Terminal mit der Beschreibung übereinstimmt. 

## Teil 3 (10 Punkte)

### Aufgabe 5 – Summe von Dateien (8 Punkte)

In der Klasse `FileSizeCalculator` ist ein kurzer Ausschnitt eines Dateisystems abgebildet.
Relevant für den Aufbau des Dateisystems sind die Klassen `FileElement`, `File` und `Directory` - wobei die zwei letzteren Klassen von `FileElement` erben.
Mache Dich mit dem Aufbau der Klassen vertraut.
Implementiere anschließend die Methode `calculateTotalSize`, welche mit einem **rekursiven** Algorithmus die Gesamtgröße des Dateisystems berechnet.

<u>Hinweis:</u> Verwende _Cast_-Operationen, um je nach Element auf die korrekten Attribute zuzugreifen.

Die Ausgabe im Terminal muss schlussendlich wie folgt sein: `Total KB size: 10312`

### Aufgabe 6 – Infinity-Stream (2 Punkte)

In `InfinityStream` sollen anhand eines Namens-Arrays und eines zufälligen Alters eine <u>bestimmte</u> Anzahl an `Doctor`-Objekten erstellt werden.
Vorgesehen ist es, dass <u>**10**</u> `Doctor`-Objekte erstellt und anschließend ausgegeben werden.
Wenn das Programm ausgeführt wird, ist jedoch ersichtlich, dass es zu einer Endlosschleife kommt.

<u>Aufgabe</u>: Behebe bzw. ergänze die Stream-Operation, sodass 10 `Doctor`-Objekte erstellt und ausgegeben werden.