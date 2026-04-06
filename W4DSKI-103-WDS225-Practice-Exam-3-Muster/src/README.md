# W4DSKI-103 - Grundlagen Programmierung - Probe-Programmentwurf-3

Kurs: WDS225

## Teilbereich 1 (20 Punkte)

### Aufgabe 1 – Gringotts Wizarding Bank (11 Punkte)

Erstellen Sie eine Banking-Anwendung mit einer Klasse `Account` und einer Hauptklasse `BankingApp` (Datei `BankingApp.java` und Klassen `BankingApp` sowie `Account` bereits angelegt) gemäß den folgenden Anforderungen:

1. Implementieren Sie eine Klasse `Account` mit:
    - Einer **statischen finalen Konstante** `BANK_NAME` mit dem Wert `"Gringotts"`
    - Einem **finalen Attribut** `accountNumber` (vom Typ `String`)
    - Einem **Instanzattribut** `balance` (vom Typ `double`)

2. Erstellen Sie einen Konstruktor, der die Kontonummer und einen Anfangsbetrag entgegennimmt

3. Implementieren Sie eine **finale Methode** `printInfo()`, die Kontonummer und Kontostand ausgibt

4. Implementieren Sie eine Methode `deposit(double amount)`, die den Kontostand erhöht

5. In der `main`-Methode der Klasse `BankingApp`:
    - Erstellen Sie ein Konto mit der Nummer `"Vault-713"` und einem Anfangsbetrag von `5000.0`
    - Tätigen Sie eine Einzahlung von `50`
    - Geben Sie eine Willkommensnachricht mit dem Banknamen aus
    - Rufen Sie die `printInfo()`-Methode auf

Erwartete Ausgabe

```
Welcome to Gringotts
Account: Vault-713 | Balance: $5050.0
```

### Aufgabe 2 – Intensivstation Monitoring System (7 Punkte)

Erstellen Sie ein Monitoring-System für eine Intensivstation mit einer Klasse `Icu` und einer Hauptklasse `IcuApp` (Datei `IcuApp.java` bereits angelegt) gemäß den folgenden Anforderungen:

1. Implementieren Sie eine Klasse `Icu` mit drei **überladenen statischen Methoden** namens `monitor()`. Verwenden Sie passende Datentypen bei den Parametern:
    - Eine Methode, die `bpm` (Herzfrequenz) entgegennimmt und folgende Ausgabe tätigt: `"Heart Rate: <bpm>"`
    - Eine Methode, die `temp` (Körpertemperatur) entgegennimmt und folgende Ausgabe tätigt: `"Temp: <temp>°C"`
    - Eine Methode, die `med` (Medikamentenname) und `dose` (Dosierung) entgegennimmt und folgende Ausgabe tätigt: `"Administering <dose>mg of <med>"` 

2. In der `main`-Methode der Klasse `IcuApp` sind folgende Aufrufe bereits gegeben:
```java
Icu.monitor(72);
Icu.monitor(36.7);
Icu.monitor("Paracetamol", 500);
```

Erwartete Ausgabe:

```
Heart Rate: 72
Temp: 36.7°C
Administering 500mg of Paracetamol
```


## Teilbereich 2 (40 Punkte)

### Aufgabe 3 – Triage Entscheidung (8 Punkte)

Erstellen Sie ein Triage-System für eine Notaufnahme mit einem Enum `TriageLevel` und einer Hauptklasse `TriageSystem` (Dateien und Klassen bereits angelegt) gemäß den folgenden Anforderungen:

1. Implementieren Sie ein Enum `TriageLevel` mit drei Triage-Stufen:
    - `RED` für Notfälle (Beschreibung _"Emergency"_) mit einer Wartezeit von 0 Minuten
    - `YELLOW` für dringende Fälle (Beschreibung _"Urgent"_) mit einer Wartezeit von 20 Minuten
    - `GREEN` für nicht dringende Fälle (Beschreibung _"Non-Urgent"_) mit einer Wartezeit von 120 Minuten

2. Implementieren Sie eine Methode `getStatus()`, die einen formatierten String zurückgibt, der die Beschreibung und Wartezeit im Format `"<Beschreibung> (Wait: <Wartezeit>m)"` enthält

3. In der `main`-Methode der Klasse `TriageSystem` ist folgender Aufruf bereits gegeben:
```java
System.out.println(TriageLevel.RED.getStatus());
```

Erwartete Ausgabe:

```
Emergency (Wait: 0m)
```

### Aufgabe 4 – Narnia Kampfkarte (13 Punkte)

Erstellen Sie ein Programm zur Analyse von Aslans Armee in der Klasse `NarniaBattleMap`.
Der Record `Soldier` mit den Attributen `name` (String), `strength` (int) und `magicMultiplier` (double) sowie die ArrayList `aslansArmy` mit folgenden Soldaten sind bereits gegeben:

```java
ArrayList<Soldier> aslansArmy = new ArrayList<>(List.of(
    new Soldier("Talking Lion", 100, 1.0),
    new Soldier("Centaur", 50, 1.2),
    new Soldier("Dryad", 30, 1.5),
    new Soldier("Faun", 15, 2.0),
    new Soldier("Bird", 5, 1.0),
    new Soldier("Susan Pevensie", 99, 1.1)
));
```

#### Ihre Aufgaben

1. Ermitteln Sie automatisiert den Soldaten mit dem **kürzesten Namen** in Aslans Armee

2. Ermitteln Sie automatisiert die **stärkste Einheit** in Aslans Armee. Berücksichtigen Sie dabei die **effektive Stärke**, die sich aus der Multiplikation von `strength` und `magicMultiplier` ergibt.

3. Geben Sie beide Ergebnisse wie folgt aus:

Erwartete Ausgabe:

```
Shortest name: Faun
Strongest unit: Susan Pevensie
```

### Aufgabe 5 – Battleship 3D (19 Punkte)

Erstellen Sie in der Klasse `Battleship3D` ein Schiffe-Versenken-Spiel für **zwei Spieler** mit folgenden Anforderungen:

1. Erstellen Sie eine geeignete Datenstruktur, um die Spielfelder beider Spieler zu verwalten.
Jedes Spielfeld hat eine Größe von **10x10** Feldern.
Initialisieren Sie alle Felder mit dem Zeichen `'~'` (Wasser).

2. Implementieren Sie eine Methode mit dem Namen `placeShip()` mit folgender Signatur.
Die Methode soll ein Schiff auf dem Spielfeld platzieren und folgende Bedingungen prüfen:

- **Grenzen-Prüfung**: Alle Koordinaten müssen innerhalb des gültigen Bereichs (0-9) liegen
- **Ausrichtung-Prüfung**: Das Schiff muss entweder horizontal oder vertikal ausgerichtet sein (keine diagonalen Schiffe)
- **Kollisions-Prüfung**: An den angegebenen Positionen darf kein anderes Schiff vorhanden sein

Wenn alle Bedingungen erfüllt sind, markieren Sie die entsprechenden Felder mit `'S'` (Schiff) in Ihrer gewählten Datenstruktur und geben `true` zurück. Andernfalls geben Sie `false` zurück, ohne das Spielfeld zu verändern.

3. In der `main`-Methode:
   - Initialisieren Sie die Spielfelder (siehe Schritt 1)
   - Platzieren Sie ein Schiff für Spieler `0` von Position `(1,1)` bis `(1,4)`
   - Geben Sie aus, ob die Platzierung erfolgreich war

Erwartete Ausgabe:

```
Ship placed: true
```


## Teilbereich 3 (20 Punkte)

### Aufgabe 6 – WebShooter Komprimierung (14 Punkte)

Spider-Man möchte sein Spinnennetz-Muster effizient speichern.
Erstellen Sie in der Klasse `WebShooter` einen Algorithmus zur **Komprimierung** und anschließenden **Dekomprimierung** eines Strings.

Das gegebene Spinnennetz-Muster lautet:
```java
String webPattern = "AAAABBBCCDAA";
```

#### Ihre Aufgaben

1. **Komprimierung**: Implementieren Sie einen Algorithmus, der aufeinanderfolgende gleiche Zeichen zählt und im Format `<Anzahl><Zeichen>` komprimiert.
   - Beispiel: `"AAAABBBCCDAA"` wird zu `"4A3B2C1D2A"`

2. **Dekomprimierung**: Implementieren Sie einen Algorithmus, der den komprimierten String wieder in das ursprüngliche Format zurückverwandelt.
   - Beispiel: `"4A3B2C1D2A"` wird zu `"AAAABBBCCDAA"`
   - Sie können davon ausgehen, dass die Anzahl aufeinanderfolgender Zeichen nicht größer als **4** ist

3. Geben Sie sowohl das komprimierte als auch das dekomprimierte Ergebnis aus.


Erwartete Ausgabe:

```
Compressed Web: 4A3B2C1D2A
Decompressed Web: AAAABBBCCDAA
```

### Aufgabe 7 – HighEndBar (6 Punkte)

Die _"HighEndBar"_ schenkt in der gleichnamigen Java-Klasse (siehe `HighEndBar.java`) Cocktails jeglicher Art aus.
Ein Gast bestellt den `Negroni` für **12 Euro** von der Karte.
Jedoch findet der Kellner komischerweise den Cocktail nicht mit der `contains()`-Methode.

Finden Sie den Fehler im Code.
Sie dürfen dabei die `Cocktail`-Klasse beliebig modifizieren, die `HighEndBar`-Klasse jedoch nicht.

Erwartete Ausgabe:

```
Is on menu? true
```