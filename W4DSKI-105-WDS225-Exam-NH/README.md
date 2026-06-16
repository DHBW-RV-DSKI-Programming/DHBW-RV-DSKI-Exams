# W4DSKI-105-WDS225-Exam-NH

Maximale Punktzahl: 50 Punkte

Dauer: 60 Minuten

Dozent: Mario Pfob

## Teil 1 (20 Punkte)

### Aufgabe 1 – Protokoll (6 Punkte)

Mithilfe der Klasse `AuditTrail` soll das Protokoll in der Datei `audit.log` fertiggestellt werden.

Die Anforderung ist es, den folgenden Absatz **am Ende der Datei zu ergänzen**:

```
=== finish audit trail ===
```

Verwenden Sie hierzu die `FileWriter` Klasse.
Ein explizites Exception-Handling ist nicht erforderlich, die `IOException` kann mittels `throws` weitergegeben werden.

Die vollständige Log-Datei muss wie folgt aussehen:

```
2026-05-20 User 'C' logged in
2026-05-21 User 'A' logged in
2026-05-22 User 'A' logged in
2026-05-22 User 'B' logged in
2026-05-23 User 'A' logged in
=== finish audit trail ===
```

### Aufgabe 2 – Musiksuche (14 Punkte)

In der Klasse `SongApp` sind einige `Song`-Objekte in einer Liste vorgegeben (die Songliste, sowie der Record dürfen nicht verändert werden).

Ihre Aufgabe ist es, eine **Suche** inklusive **Fehlerhandling** zu implementieren.
Die Anforderungen sind:
1. Erstellen Sie die Exception `SongNotFoundException`, welche im Konstruktor einen Songtitel übergeben bekommt.
Diese Exception gibt den formatierten String wie folgt weiter: `"Song '<songTitle>' not found"`
2. Implementieren Sie die Methode `findSong`.
Diese Methode nimmt als Parameter die **Songliste** sowie den gesuchten **Songtitel** entgegen.
Als Ergebnis wird ein Objekt vom Typ `Song` zurückgegeben, im Fehlerfall wird eine `SongNotFoundException` geworfen.
Die Methode soll alle Objekte innerhalb der List prüfen, ob der gesuchte Songtitel **enthalten** ist – d.h. es muss nicht der komplette Titel übereinstimmen.
Das **erste** gefundene Ergebnis wird hierbei zurückgegeben, wird kein Ergebnis gefunden, wird eine `SongNotFoundException` geworfen.
3. Rufen Sie die `findSong` Methode in der `main`-Methode zweimal auf.
Das erste Mal mit dem Titel `Concerning Hobbits` und beim zweiten Mal mit dem Titel `Lumière`.
4. Abschließend: Fangen Sie den Fehlerfall in der `main`-Methode ab, und geben Sie dort Exception-Nachricht auf der Konsole aus.

Die Ausgabe auf der Konsole muss wie folgt aussehen:

```
Song[title=The Lord of the Rings (Concerning Hobbits), artist=Howard Shore, year=2001]
Song 'Lumière' not found
```


## Teil 2 (20 Punkte)

### Aufgabe 3 – Bücher und Autoren einer Bibliothek (7 Punkte)

In der Klasse `Library` ist eine Liste von `Book` Objekten in einer Liste vorgegeben.
Die Variable `books` selbst, darf nicht modifiziert werden.

Finden Sie eine geeignete **Datenstruktur**, um **Listen von Büchern** pro **Autor** zu speichern.
Nutzen Sie anschließend die Bücherliste, um die gewählte Datenstruktur mit Objekten zu befüllen.
Geben Sie abschließend die Bücher pro Autor auf der Konsole aus. 

### Aufgabe 4 – Server-Verwaltung (13 Punkte)

Sie sollen eine Server-Übersicht innerhalb der `main`-Methode der Klasse `ServerManager` implementieren.
Die **vorgegebene** (und nicht zu verändernde) Liste von `Server`-Objekten soll hierzu nach **Präfix (`name`)** gruppiert und anschließend die **durchschnittliche Laufzeit (`uptimeInDays`) pro Gruppe** berechnet werden.

Das Präfix besteht hierbei aus den Buchstaben bis zum ersten `"-"` im Servernamen.
<u>Beispiel:</u> Bei `"web-prod-01"` ist der Präfix `"web"`.
Ist kein `"-"` im Namen vorhanden, wird der gesamte Name verwendet.

Geben Sie anschließend die durchschnittliche Laufzeit pro Gruppe auf der **Konsole** aus.
Sie können hierfür den folgenden formatierten String verwenden: `%-15s avg uptime: %.1f days%n`

Die Operationen zur Gruppierung, Berechnung und Ausgabe **müssen** mittels **Stream-Operationen** implementiert werden.

## Teil 3 (10 Punkte)

### Aufgabe 5 – Sonnensystem (8 Punkte)

Implementieren Sie in der `SolarSystem`-Klass eine Funktion, welche den **nächstgelegenen** Planeten aus der `planets`-Liste ermittelt.
Der nächstgelegene Planet ist jener, welcher den geringsten Wert im Attribut `distanceFromSunKm` besitzt.

Ermitteln Sie den nächstgelegenen Planeten mittels **Rekursion** und geben Sie ihn auf der **Konsole** aus.

### Aufgabe 6 – Programmiersprachen (2 Punkte)

Innerhalb der `Language`-Klasse kommt es zu einem Bug.
Die ursprüngliche Anforderung ist die `ProgrammingLanguage`-Elemente, sortiert nach **year** (aufsteigend) und dann nach **name** (aufsteigend), auf der Konsole auszugeben.

Jedoch fehlen aktuell offensichtlich einige Programmiersprachen in der Konsolenausgabe.
Ihre Aufgabe ist es, den Bug zu identifizieren und zu beheben, sodass die Konsolenausgabe wie folgt aussieht:

```
C (1972)
C++ (1983)
Python (1991)
Java (1995)
JavaScript (1995)
Ruby (1995)
C# (2000)
Go (2009)
Rust (2011)
Swift (2014)
```
