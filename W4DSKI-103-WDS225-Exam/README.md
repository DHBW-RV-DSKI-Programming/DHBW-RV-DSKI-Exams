# W4DSKI-103 - Grundlagen Programmierung - Programmentwurf

Kurs: WDS225

## Teilbereich 1 (20 Punkte)

### Aufgabe 1 – Die Flotte der Rebellen (14 Punkte)

Die Rebellen-Allianz bereitet unter der Führung von Prinzessin Leia den finalen Schlag gegen das Imperium vor.
Admiral Ackbar nutzt ein Java-System, um die Feuerkraft der legendärsten Piloten der Galaxis zu koordinieren.

**Ihre Aufgabe:**

1) Erstellen Sie das Enum `Spaceship` (Datei `Spaceship.java` bereits angelegt), welches die folgenden **4 Werte** beinhaltet:
   `X_WING`, `MILLENNIUM_FALCON`, `A_WING` und `Y_WING`
2) Des Weiteren besitzt das `Spaceship`-Enum zwei Eigenschaften: `firepower` und `pilot`.
   Diese Eigenschaften sollen über einen Konstruktor initialisiert und über jeweilige Getter-Methoden gelesen werden können.
3) Ordnen Sie nun den vier Raumschiffen jeweils die folgende Feuerkraft und Piloten zu:
    1) `X_WING`; `55`; `"Luke Skywalker"`
    2) `MILLENNIUM_FALCON`; `100`; `"Han Solo"`
    3) `A_WING`; `40`; `"Lando Calrissian"`
    4) `Y_WING`; `30`; `"Wedge Antilles"`
4) Achten Sie auf die Zugriffsmodifikatoren, sodass die Sichtbarkeit möglichst gering vor Spionen des Imperiums ist!
5) Ferner werden in der Main-Methode der Klasse `RebelFleetApp` alle Werte des `Spaceship`-Enums mit einer **for**-Schleife durchlaufen.
   Innerhalb der **for**-Schleife muss eine **if**-Bedingung eingebaut werden, die prüft, ob der Name des Piloten **ungleich** `"Wedge Antilles"` ist - dieser Pilot ist verletzt.
   Die jeweilige Feuerkraft der anderen Piloten muss der Variable `totalPower` hinzugefügt werden.
6) Zum Schluss wird die Gesamtfeuerkraft der Rebellen auf der Konsole ausgegeben:

_Erwartete Ausgabe:_

```
Rebels' offensive power: 195
```

### Aufgabe 2 – Fausts Pakt (6 Punkte)

Mephistopheles hat ein kleines Programm geschrieben, um zu entscheiden, wie viele Punkte Faust für sein Streben erhält.
Die Logik basiert auf verschachtelten **ternären Operatoren** und/ oder **if-Bedingungen**.
Der folgende Variablenblock ist gegeben und darf **nicht** verändert werden:

```java
boolean gestoppt = false;
int streben = 100;
String charakter = "Faust";
```

**Ihre Aufgabe:**

Die folgenden Aufgaben müssen in der gegebenen Reihenfolge in der Main-Methode der Klasse `MephistoPakt` programmiert werden.

1) **Initialisierung:** Wenn das `streben` **größer als 50** ist, erhält Faust initial `10` Punkte, andernfalls `0`.
2) **Namensprüfung:** Erhöhen Sie den aktuellen Wert von `punkte` um `5`, falls der Charakter den Namen **"Mephisto"** trägt, ansonsten erhöhen Sie den Wert nur um `2`.
3) **Der Moment verweilt:** Weisen Sie `punkte` einen **neuen** Wert zu: Falls gestoppt `wahr` ist, verliert Faust **10 Punkte**, ansonsten gewinnt er **5 Punkte** dazu.
4) **Der komplexe Bonus:** Addieren Sie einen Bonus zu den aktuellen Punkten: Falls `punkte` aktuell **größer als 15** ist, soll geprüft werden, ob das `streben` **kleiner als 200** ist.
   Wenn ja, beträgt der Bonus `20`, wenn nein `30`.
   Sollte `punkte` **15 oder weniger** sein, beträgt der Bonus nur `5`.
5) **Das Urteil:** Erstellen Sie eine String-Variable `resultat`.
   Wenn `punkte` **größer als 35** beträgt, ist der Inhalt `"Gerettet"`, andernfalls `"Verloren"`.
6) **Die Verkündung:** Geben Sie das **Resultat** und die **Punktzahl** auf der Konsole aus – die Formatierung der Ausgabe ist egal.


## Teilbereich 2 (40 Punkte)

### Aufgabe 3 – Server-Standorte (11 Punkte)

Ein Rechenzentrum verwaltet Server-Knoten.
Es soll eine Applikation geschrieben werden, welche die Hardware analysiert und den Standort mit den meisten Geräten ermittelt.

**Ihre Aufgabe:** Vervollständigen Sie die Klasse `HardwareManagerApp`

1. Erstellen Sie den Record `Hardware` (Datei `Hardware.java` bereits angelegt) mit den Attributen `int power` (_Leistungswert_), `boolean isActive` und `String location` (_Standort_).
2. Für die main-Methode ist folgende ArrayList gegeben (Statement `import java.util.ArrayList;` nicht vergessen):

```java
ArrayList<Hardware> cluster = new ArrayList<>();
cluster.add(new Hardware(100, true, "Frankfurt"));
cluster.add(new Hardware(99, true, "München"));
cluster.add(new Hardware(30, true, "Berlin"));
cluster.add(new Hardware(80, true, "Frankfurt"));
cluster.add(new Hardware(12, false, "Hamburg"));
cluster.add(new Hardware(90, true, "Frankfurt"));
cluster.add(new Hardware(36, false, "München"));
cluster.add(new Hardware(81, true, "München"));
cluster.add(new Hardware(54, true, "Berlin"));
cluster.add(new Hardware(11, true, "Hamburg"));
cluster.add(new Hardware(0, false, "Berlin"));
cluster.add(new Hardware(96, true, "Frankfurt"));
```

3. Implementieren Sie eine Logik, die **alle Standorte** durchläuft und zählt, wie viele Hardware-Komponenten an jedem Standort vorhanden sind.
4. Ermitteln Sie den **Standort mit den meisten Geräten** und geben Sie diesen auf der Konsole aus.

_Erwartete Ausgabe:_

```
Top-Standort: Frankfurt
```

### Aufgabe 4 – Digitaler Instrumenten-Katalog (8 Punkte)

In einem Musikarchiv liegen Daten zu Instrumenten oft als unsaubere Zeichenketten vor.
Ihre Aufgabe ist es, eine Methode zu schreiben, die einen solchen _"Roh-String"_ verarbeitet, wichtige Informationen extrahiert und normiert zurückgibt.

#### Das Szenario

Ein typischer Eingabe-String sieht wie folgt aus: `"  GITARRE;Saiteninstrument;6_Saiten  "`.
Das Ziel ist es …
- den **Namen des Instruments** (hier: _"Gitarre"_) zu **isolieren** (**ohne** Leerzeichen) und in **Kleinbuchstaben umzuwandeln**,
- die **Unterstriche durch Leerzeichen** zu ersetzen
- und anschließend einen String mit der folgenden **Formatierung** zurückzugeben: `Instrument: <instrumentName>, Details: <detailsText>`

**Ihre Aufgabe:**
Implementieren Sie die **Funktion** mit der Signatur `processInstrumentData(String rawData)` innerhalb der Klasse `MusicManager`.
Die Methode soll die logischen Schritte des Szenarios umfassen.
Nutzen Sie die `String`-Methoden der Java-Standardbibliothek.

Die main-Methode kann mit folgender Zeile getestet werden:

```java
public static void main(String[] args) {
    System.out.println(processInstrumentData("  GITARRE;Saiteninstrument;6_Saiten  "));
}
```

_Zu erwartendes Ergebnis:_

```
Instrument: gitarre, Details: 6 Saiten
```

### Aufgabe 5 – Texteditor (21 Punkte)

Stellen Sie sich vor, Sie entwickeln das Backend für einen minimalistischen Texteditor.
Eine Kernfunktion jedes Editors ist die Möglichkeit, die letzten Eingaben rückgängig zu machen.
Da das System auf extrem ressourcensparender Hardware läuft, dürfen Sie keine dynamischen Listen (wie `ArrayList`) verwenden.
Ihnen steht lediglich ein **klassisches Array** zur Verfügung.

#### Das Szenario

Ihr Editor soll Wörter speichern können.
Wenn der Benutzer tippt, wird das Wort dem Verlauf hinzugefügt.
Wenn der Benutzer _"Undo"_ wählt, wird die letzte Eingabe _"vergessen"_.

#### Ihre Aufgaben

Implementieren Sie eine Klasse `TextEditor` (Datei `TextEditor.java` bereits angelegt), welche die folgenden Anforderungen erfüllt.

1. Der Editor muss eine festlegbare Anzahl an Wort-Einträgen in einem Array verwalten können.
Überlegen Sie sich eine Möglichkeit, wie Sie die aktuelle Position innerhalb dieses Arrays dauerhaft speichern, damit das System jederzeit weiß, wo das nächste Wort eingefügt werden muss oder welches Wort zuletzt geschrieben wurde.
2. Implementieren Sie eine Prozedur mit der Signatur `type(String text)`, die ein neues Wort im System hinterlegt.
Das Wort muss an der Stelle landen, die der aktuellen Position im Verlauf entspricht.
Sorgen Sie dafür, dass der _"Positionszeiger"_ nach dem Schreiben korrekt für den nächsten Eintrag vorbereitet ist.
Verhindern Sie aktiv, dass das Programm abstürzt, falls mehr Wörter getippt werden, als das Array groß ist.
3. Implementieren Sie eine Prozedur mit der Signatur `undo()`, die den letzten Schreibvorgang revidiert.
Es reicht aus, den internen Zustand so zu verändern, dass das letzte Wort beim nächsten Schreibvorgang überschrieben würde oder beim Anzeigen nicht mehr erscheint.
Geben Sie das Wort, das gerade _"rückgängig"_ gemacht wurde, auf der Konsole aus.
Stellen Sie sicher, dass die Methode auch dann stabil bleibt, wenn der Verlauf bereits leer ist.
4. Implementieren Sie eine Methode, die den **aktuell gültigen** Text (alle Wörter vom Start bis zur aktuellen Position) in einer einzigen Zeile ausgibt.
5. In der main-Methode der Klasse `Editor`-App:
   1. Erstellen Sie einen Editor für **5** Einträge.
   2. Tippen Sie drei beliebige Wörter hintereinander.
   3. Führen Sie einmal _"Undo"_ aus.
   4. Lassen Sie den aktuellen Text anzeigen.

_Exemplarische Ausgabe:_

```
Rückgängig: Nuxt
Java PostgreSQL 
```


## Teilbereich 3 (20 Punkte)

### Aufgabe 6 – Datenanalyse-Tool (14 Punkte)

Sie arbeiten an einem Datenanalyse-Tool, das kontinuierliche Messwerte auswertet.
Eine zentrale Anforderung ist es, die **maximale Summe** von **k aufeinanderfolgenden Werten** effizient zu berechnen, ohne dabei jedes Mal alle Elemente neu zu summieren.

### Das Szenario

Gegeben ist ein Array mit ganzzahligen Messwerten und eine Fenstergröße `k`.
Ziel ist es, die höchste Summe zu finden, die entsteht, wenn man `k` aufeinanderfolgende Werte addiert.

**Beispiel:**
- Array: `{2, 1, 5, 1, 3, 2}`
- Fenstergröße: `k = 3`
- Mögliche Fenster:
    - `[2, 1, 5]` → Summe: 8
    - `[1, 5, 1]` → Summe: 7
    - `[5, 1, 3]` → Summe: 9
    - `[1, 3, 2]` → Summe: 6
- **Maximale Summe:** 9

### Ihre Aufgabe

Implementieren Sie in der `main`-Methode der Klasse `DataTool` eine Lösung, die folgende Schritte umsetzt:

1. Deklarieren Sie ein Integer-Array `nums` mit den Werten `{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}` und eine Integer-Variable `k` mit dem Wert `4`.
2. Berechnen Sie die **maximale Summe** für die Fenstergröße `k` im Array `nums`.
   1. Sie müssen hierbei das Array mit **nur einer Iteration** durchlaufen.  
3. Geben Sie am Ende das Ergebnis mit folgender Formatierung auf der Konsole aus:

```
The maximum sum of <k> consecutive elements is: <maxSum>
```

### Aufgabe 7 – Geralts Alchemie-Dilemma (6 Punkte)

Geralt von Riva versucht, seine Ausrüstung für einen Kampf gegen eine Stryge vorzubereiten.
Er nutzt ein Java-Programm, um seine Tränke zu verwalten und sein Silberschwert zu ölen.
Doch irgendetwas stimmt nicht: Trotz der Ausführung der Methoden ändern sich die Werte nicht wie erwartet.

**Ihre Aufgabe:**
Untersuchen Sie den Code in der Klasse `WitcherApp`.
Finden Sie heraus, warum das Schwert nicht geölt wird und warum die Anzahl der Schwalbe-Tränke gleich bleibt, obwohl die Methoden aufgerufen wurden.
Beheben Sie anschließend den Fehler.