# W4DSKI-103 - Grundlagen Programmierung - Wiederholungs-Programmentwurf

Kurs: WDS225

## Teilbereich 1 (20 Punkte)

### Aufgabe 1 – Formel-1-Rennwagen (14 Punkte)

Implementieren Sie ein Programm zur Simulation eines Formel-1-Rennwagens mit verschiedenen Systemen.
Nutzen Sie hierfür die `Race.java`-Datei.

**Anforderungen:**

1. Erstellen Sie ein Interface `EnergyRecoverySystem` mit der Prozedur `boost()`
2. Erstellen Sie ein Interface `DragReductionSystem` mit der Prozedur `openFlap()`
3. Implementieren Sie eine Klasse `RedBullRacingRB22`, die beide Interfaces implementiert:
   - Die Methode `boost()` soll _"Regaining energy"_ ausgeben
   - Die Methode `openFlap()` soll _"DRS Active: Drag reduced."_ ausgeben
4. Schreiben Sie in der `main`-Methode der Klasse `Race` folgenden Code:
   - Erstellen Sie ein Objekt vom Typ `RedBullRacingRB22`
   - Rufen Sie die Methoden `boost()` und `openFlap()` auf

**Erwartete Ausgabe:**

```
Regaining energy
DRS Active: Drag reduced.
```

### Aufgabe 2 – Eilmeldungen (6 Punkte)

Implementieren Sie ein Programm, das Eilmeldungen (Live-Alerts) verwaltet und nacheinander ausgibt.
Nutzen Sie hierfür die `NewsFeed`-Klasse.

**Anforderungen:**

1. Erstellen Sie eine `ArrayList` als Variable.
2. Fügen Sie folgende drei Meldungen zur Liste hinzu:
    - _"Did Scientists Just Detect an Exploding Black Hole?"_
    - _"The best food items at MLB parks this season, and how some of them came to be"_
    - _"No, Britain Is Not Having a Christian Revival"_
3. Iterieren Sie über die Liste und geben Sie jede Meldung mit dem Präfix `FLASH: ` auf der Konsole aus.

**Erwartete Ausgabe:**

```
FLASH: Did Scientists Just Detect an Exploding Black Hole?
FLASH: The best food items at MLB parks this season, and how some of them came to be
FLASH: No, Britain Is Not Having a Christian Revival
```


## Teilbereich 2 (40 Punkte)

### Aufgabe 3 – Kreditkarten-Maskierung (7 Punkte)

Implementieren Sie ein Programm zur Verarbeitung und Maskierung von Kreditkartennummern.
Nutzen Sie hierfür die `BankUtils`-Klasse.

**Anforderungen:**

Gegeben ist folgende Kreditkartennummer als String: `" 4532-1234-5678-9012 "`

1. Bereinigen Sie die Kreditkartennummer von **Leerzeichen** am **Anfang & Ende**
2. Entfernen Sie alle **Bindestriche** (`-`) aus der Nummer
3. Erstellen Sie eine maskierte Darstellung im Format `****-****-****-XXXX`, wobei nur die letzten **4 Ziffern** sichtbar bleiben
4. Bestimmen Sie den Kartentyp: Wenn die Nummer mit `4` beginnt, ist es `VISA`, ansonsten `UNKNOWN`
5. Geben Sie folgende Informationen auf der Konsole aus:
   - `Status: ` gefolgt vom **Kartentyp**
   - `Display: ` gefolgt von der **maskierten Kartennummer**

### Aufgabe 4 – Raspberry Pi Cluster (15 Punkte)

Implementieren Sie ein Programm zur Simulation eines Raspberry Pi Clusters mit verschiedenen Modellen.
Nutzen Sie hierfür die `PiCluster.java`-Datei.

**Anforderungen:**

1. Entwickeln Sie eine Hierarchie für **verschiedene Raspberry Pi Modelle**.
Jede dieser Modelle muss eine Methode für den Bootvorgang implementieren (`boot()`), welche eine beliebige Meldung auf der Konsole ausgibt.
Als konkrete Modelle können Sie `Pi4` und `PiZero` verwenden.
2. Erstellen Sie in der `main`-Methode der `PiCluster`-Klasse eine Datenstruktur, die mehrere verschiedene Pi-Modelle speichern kann
3. Fügen Sie jeweils ein Objekt von **Pi 4** und **Pi Zero** hinzu
4. Booten Sie alle Pi-Computer im Cluster

**Beispielhafte Ausgabe:**
```
Pi 4: Booting 8GB RAM via USB-C...
Pi Zero: Booting low-power via Micro-USB...
```

### Aufgabe 5 – Intelligenter Rasenmäher (18 Punkte)

Implementieren Sie ein Programm zur Simulation eines autonomen Rasenmähers, der eine rechteckige Gartenfläche abfährt.
Nutzen Sie hierfür die `SmartMower`-Klasse.

**Anforderungen:**

Der Garten hat folgende Struktur (**4x3 Felder**):
- Zeile 1: Gras, Gras, Hindernis
- Zeile 2: Gras, Hindernis, Gras
- Zeile 3: Gras, Gras, Gras
- Zeile 4: Gras, Hindernis, Gras

Ihr Programm soll:

1. Eine geeignete **Datenstruktur** verwenden, um den Garten mit 4 Zeilen und 3 Spalten zu speichern
2. Den Garten **Zeile für Zeile** durchlaufen (erst alle Felder der ersten Zeile, dann alle Felder der zweiten Zeile usw.)
3. <u>Bei Gras:</u> Das Feld als gemäht **markieren** und **ausgeben**: `Mowed [row,col] `
4. <u>Bei einem Hindernis:</u> Ausgeben: `Obstacle at [row,col]! `
5. Die **Anzahl** der gemähten Felder mitzählen
6. Nach dem Durchlaufen des Gartens erfolgt die Ausgabe: `Total area mown: X units` (X = Anzahl der gemähten Felder).


## Teilbereich 3 (20 Punkte)

### Aufgabe 6 – Task-Scheduler (13 Punkte)

Implementieren Sie einen Task-Scheduler, der Aufgaben nach Priorität abarbeitet.
Ein **Code-Gerüst** ist in `TaskScheduler.java` enthalten.

**Ihre Aufgabe:**

Implementieren Sie die fehlenden Teile so, dass alle Tasks **nach Priorität** ausgeführt werden (4 → 3 → 2 → 1).
Jeder ausgeführte Task soll mit `- ` als Präfix ausgegeben werden.

Sie dürfen zur Erfüllung der Aufgaben Code-Änderungen innerhalb der `executeTasks()` vornehmen.
Zudem können Sie neue Methoden definieren und implementieren.

Die Ausgabe nach Priorität darf **nicht manuell** gecoded werden.

### Aufgabe 7 – Musik-Player (7 Punkte)

In der Datei `MusicApp.java` befindet sich ein Musik-Player-Programm mit mehreren Bugs.

**Ihre Aufgabe:**

Analysieren Sie den Code und beheben Sie alle Stellen, an denen aktuell Fehler auftreten.
Fügen Sie entsprechende **Checks** hinzu und implementieren Sie geeignete **Fehlerbehandlungen** inklusive aussagekräftiger **Meldungen**.
Das Programm soll nach den Korrekturen fehlerfrei durchlaufen


**Erwartete Ausgabe nach der Korrektur:**
```
No playlist loaded.
Now playing: Drag Path
Skipping missing song
---
My favourite song: Cruel Summer
```