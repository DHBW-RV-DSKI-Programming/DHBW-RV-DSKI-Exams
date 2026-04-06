# W4DSKI-103 - Grundlagen Programmierung - Probe-Programmentwurf-2

Kurs: WDS225

## Teilbereich 1 (20 Punkte)

### Aufgabe 1 – Wettmarkt-System (12 Punkte)

Implementieren Sie ein einfaches Wettmarkt-System mit folgenden Anforderungen:

1. Erstellen Sie eine **abstrakte Klasse `Bet`** mit:
    - Einem Attribut `betDescription` (String) zur Beschreibung der Wette
    - Ein Konstruktor, der die Beschreibung initialisiert
    - Einer abstrakten Methode `resolve(boolean outcome)`, die das Ergebnis der Wette verarbeitet

2. Implementieren Sie eine **Unterklasse `BinaryBet`**, die von `Bet` erbt:
    - Fügen Sie ein Attribut `prediction` (boolean) hinzu, das die Vorhersage speichert
    - Implementieren Sie einen Konstruktor, der sowohl die Beschreibung als auch die Vorhersage entgegennimmt und verarbeitet
    - Überschreiben Sie die Methode `resolve()`: Vergleichen Sie die Vorhersage mit dem tatsächlichen Ergebnis und geben Sie aus, ob die Wette gewonnen (`"Won"`) oder verloren (`"Lost"`) wurde.
    Die Ausgabe soll folgendes Format haben: `"Description: <betDescription> | Result: <Won/Lost>"`

3. Sie können Ihre fertige Implementierung mit der folgenden main-Methode austesten:

```java
public static void main(String[] args) {
    Bet electionBet = new BinaryBet("Will it rain in NYC?", true);
    boolean marketOutcome = true;
    electionBet.resolve(marketOutcome);
}
```

**Beispielausgabe:**

```
Description: Will it rain in NYC? | Result: Won
```


### Aufgabe 2 – Schach-Visualisierung (8 Punkte)

Die main-Methode der Klasse `ChessIterator` soll eine Schachbrett-Visualisierung beinhalten.

Vervollständigen Sie die main-Methode mit zwei einfachen **for-Schleifen** und **Kontrollstrukturen**, sodass nur die Reihen **mit** Figuren ausgegeben und die leeren Reihen übersprungen werden.
Nutzen Sie den bereits definierten 2D `char`-Array – weiße Figuren sind hierbei durch Großbuchstaben ersichtlich, schwarze Figuren durch Kleinbuchstaben.

Erwartete Ausgabe:

```
R N B Q K B N R 
P P P P P P P P 
p p p p p p p p 
r n b q k b n r 
```


## Teilbereich 2 (40 Punkte)

### Aufgabe 3 – Authentifizierung (7 Punkte)

In einem API-Authentifizierungssystem werden Tokens verglichen, um Zugriff zu gewähren.

Ein `ApiToken` besteht aus einem `key` (String) und einer `expiry` (long).
Zwei Tokens sollen als **gleich** betrachtet werden, wenn sie denselben `key` haben – unabhängig davon, wann sie ablaufen.

Implementieren Sie eine Funktionalität in der Datei `AuthSystem.java`, welche die gegebenen `ApiToken`-Objekte inhaltlich auf Gleichheit prüft.
Schlussendlich müssen beide Objekte miteinander verglichen werden.
Im Falle einer Übereinstimmung wird folgende Ausgabe erzeugt: `"Access Granted: Tokens match."`

### Aufgabe 4 – Zeichen-Analyse (9 Punkte)

In einem Log-Analyse-System soll untersucht werden, wie oft bestimmte Zeichen in einem Text vorkommen.

Implementieren Sie in der Klasse `CharCounter` folgende Funktionalität:

1. Eine Methode, welche für **jedes** gesuchte Zeichen zählen, wie oft es im Text vorkommt, und die Häufigkeiten **pro** gesuchtem Zeichen zurückgibt.
Die Anzahl der gesuchten Zeichen ist dabei **1 bis n** (beliebige Zahl).

2. In der `main`-Methode:
   - Definieren Sie die zu suchenden Buchstaben
   - Rufen Sie Ihre in Schritt 1 definierte Methode auf und geben Sie das Vorkommen pro Buchstabe auf der Konsole aus.
   Sie können sich an folgender Ausgabe orientieren.

**Beispielhafte Ausgabe**

```
Search Results for: 'security_breach_detected_at_midnight'
------------------------------------
Character 's' appeared 1 times
Character 'e' appeared 5 times
Character '_' appeared 4 times
Character 'a' appeared 2 times
```

### Aufgabe 5 – Logistik-Auditsystem (24 Punkte)

Ein Logistikunternehmen muss eine Frachtliste (_"Manifest"_) auf Sicherheitsbestimmungen überprüfen.
Artikel, die entweder als gefährlich markiert sind oder ein bestimmtes Gewichtslimit überschreiten, müssen abgelehnt werden.

In der Klasse `LogisticsAudit` sind bereits folgende Variablen vorgegeben, diese Zeilen dürfen **nicht** verändert und müssen im zu implementierenden Code verwendet werden:

```java
ArrayList manifest = new ArrayList();
ArrayList rejected = new ArrayList();
double weightLimit = 500.0;
double totalInsuranceValue = 0;
double totalWeight = 0;
```

#### Anforderungen

1. Erstellen Sie einen Referenzdatentyp mit den Attributen: `id` (String), `weight` (double), `value` (double) und `isHazardous` (boolean); sowie einen Konstruktor und Getter-Methoden.

2. Fügen Sie dem `manifest` mindestens 5 verschiedene `Item`-Objekte hinzu, wobei mindestens ein Artikel gefährlich ist und mindestens ein Artikel das Gewichtslimit überschreitet.

3. Implementieren Sie eine Logik, die durch alle Artikel im Manifest iteriert und:
   - Gefährliche Artikel (`isHazardous == true`), sowie Artikel, die schwerer als `weightLimit` sind, in die `rejected`-Liste verschiebt (verschieben = aus `manifest` herauslöschen und `rejected` hinzufügen)
   - Für alle verbleibenden (genehmigten) Artikel den Versicherungswert (`totalInsuranceValue`) und das Gesamtgewicht (`totalWeight`) berechnet

4. Berechnen Sie anschließend das durchschnittliche Gewicht der **genehmigten** Artikel.

5. Geben Sie folgende Informationen auf der Konsole aus:
   - Anzahl der genehmigten Artikel
   - Anzahl der abgelehnten Artikel
   - Gesamter Versicherungswert
   - Durchschnittliches Gewicht

**Beispielhafte Ausgabe**

```
Approved Items: 2
Rejected for Safety: 3
Total Insured Value: $9450.0
Average Weight: 11.75
```


## Teilbereich 3 (20 Punkte)

### Aufgabe 6 – Sequenz-Analyse (14 Punkte)

Ein Online-Shop verwendet ein System zur automatischen Vergabe von Bestellnummern.
Aus technischen Gründen können bei der Vergabe Lücken entstehen, wenn Bestellungen beispielsweise storniert werden.

Die IT-Abteilung möchte nun analysieren, welche die **längste durchgehende Sequenz** aufeinanderfolgender Bestellnummern ist, um die Systemstabilität zu bewerten.

Gegeben ist eine **aufsteigend sortierte** Liste von Bestellnummern, die möglicherweise Duplikate und Lücken enthält.
Duplikate unterbrechen dabei die Sequenz **nicht**.

**Beispiel:**
- Input: `[10, 11, 12, 12, 13, 15, 16, 20]`
- Die längste aufeinanderfolgende Sequenz ist: `[10, 11, 12, 13]` → Länge **4**
- Ausgabe: `4`

Implementieren Sie in der Klasse `SequenceAnalyzer` eine Methode, die die **Länge** der längsten aufeinanderfolgenden Sequenz zurückgibt.

### Aufgabe 7 – Fehler im Zahlungsverkehr (6 Punkte)

In der Klasse `BankingApp` einer deutschen Großbank kommt es zu einem Fehler, wodurch eine seltsame Zahl auf der Konsole ausgegeben wird: `"Sum: 127.92999999999999"`

Die korrekte Summe der Beträge sollte `"Sum: 127.93"` ergeben.
Finden Sie eine Implementierung, welche die Summierung der drei `BankTransfer`-Objekte - sowie potenziell andere `BankTransfer`-Objekte - korrekt **ausgibt**.

Das **statische** Einfügen der korrekten Summe ist **nicht** erlaubt.


### Bonus #1 (15 Punkte)

Implementieren Sie ein Traffic-Management-System für API-Anfragen:

**Klasse `APIRequest`:**
- Statisches Attribut `globalLimit` (int) = 5
- Statisches Attribut `totalRequests` (int) = 0
- Instanzattribut `endpoint` (String)
- Konstruktor: nimmt URL entgegen, weist `endpoint` zu, erhöht `totalRequests`
- Statische Methode `isOverloaded()`: gibt `true` zurück wenn `totalRequests >= globalLimit`

**Klasse `TrafficManager` mit `main`-Methode:**
- `ArrayList<APIRequest>` namens `queue` erstellen
- String-Array `logs` mit 6 Endpoints definieren (z.B. `"/login"`, `"/data"`, `"/buy"`, `"/logout"`, `"/ping"`, `"/status"`)
- Über alle Endpoints iterieren:
    - Wenn überlastet: `"Blocked: <url> (Global Limit Reached)"` ausgeben
    - Sonst: `APIRequest` erstellen, zur Queue hinzufügen, `"Processing: <url>"` ausgeben

**Beispielausgabe:**

```
Processing: /login
Processing: /data
Processing: /buy
Processing: /logout
Processing: /ping
Blocked: /status (Global Limit Reached)
```