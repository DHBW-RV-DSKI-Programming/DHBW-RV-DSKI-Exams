# W4DSKI-105-WDS225-Practice-Exam

Dauer: 60 Minuten

## Teil 1 (20 Punkte)

### Aufgabe 1 – Student Report Generator (8 Punkte)

Nutzen Sie den gegebenen Code in der Datei `StudentApp.java` und erweitern Sie diesen um folgende Funktionalität:

Der Name, die Noten sowie der Durchschnitt eines jeden Studenten soll in der Datei `report.txt` gespeichert werden.
Die Angaben sollen jeweils in einer neuen Zeile geschrieben werden, zudem ist zwischen Studenten jeweils eine Leerzeile zu setzen.

Die Ausgabe eines Studenten kann wie folgt aussehen:

```text
Name: Alice
Grades: [85, 90, 78]
Average: 84.33333333333333
```

Vervollständigen Sie zur Erfüllung der Funktionalität die Methode `write()` in der Klasse `ReportWriter`.

<u>Hinweis:</u> Für das Exception-Handling in dieser Aufgabe reicht es aus, die Exception per `throws` durchzugeben.

### Aufgabe 2 – Jakes Schulden (12 Punkte)

Machen Sie sich mit dem vorhandenen Code in der Datei `BankingApp.java` vertraut.

Ihre Aufgabe ist es zum Schutz der Bankkontoinhaber, wie z.B. Detective Jake Peralta, ein **Fehlerhandling** einzubauen.
Hierbei soll eine selbst definierte Exception `InsufficientFundsException` geworfen und verarbeitet werden, sofern der **Kontostand beim Abheben nicht ausreicht** (engl. _"withdraw"_).

Implementieren Sie hierzu …
- Die `InsufficientFundsException`-Exception-Klasse
- Das Abfangen des Fehlerfalls in der `withdraw()`-Methode
- Sowie eine entsprechende Verarbeitung des Fehlers in der `main()`-Methode der `BankingApp`-Klasse.
Hierbei ist die folgende Ausgabe zu erwarten:

```text
WARNUNG: Withdrawal failed: Cannot withdraw 1000.0 — current balance is 300.0
INFORMATION: Needed money: 700.0
```

## Teil 2 (20 Punkte)

### Aufgabe 3 – Telefonbuch aus Alagaësia (13 Punkte)

Einige Personen aus Alagaësia wollen sich in ein Telefonbuch eintragen.
Das Telefonbuch verbindet den **Namen** einer Person mit einer **Telefonnummer**.

Ihre Aufgabe ist es, eine passende **Datenstruktur** innheralb der `PhoneBook`-Klasse zu entwickeln, sodass die beschriebene Funktionalität eines Telefonbuchs erfüllt ist.
Implementieren Sie dazu auch die folgenden Methoden: `addContact`, `findContact` und `deleteContact`.
Geben Sie entsprechende **Ausgaben** in der Konsole an.
Beachten Sie außerdem Fälle, in welchen ein Name entweder **bereits existiert** oder nicht existiert.

Die Methoden-Signaturen dürfen <u>**nicht**</u> verändert werden, sowie der Inhalt der `main`-Methode in der `PhoneApp`-Klasse.

### Aufgabe 4 – (Data) Warehouse (7 Punkte)

Sie sollen für ein eCommerce-Warenhaus zwei Analysen vornehmen.
Betrachten Sie hierzu zuerst den vorhandenen Code in der Datei `ECommerceApp.java`.
Implementieren Sie anschließend mittels **Stream-Operationen** folgende Anforderungen:

1. Für die erste Terminal-Ausgabe filtern Sie zuerst alle Produkte bei welchen `stock == 0` entspricht.
Anschließend geben Sie diese Produkte, sortiert nach **Preis absteigend**, in der Konsole aus.
2. Für die zweite Terminal-Ausgabe sollen alle Produktnamen zu einer **String**-Variable zusammengefasst werden.
Die Produktnamen sind in dieser Variable durch ein Komma getrennt – d.h. `Produkt1, Produkt2, Produkt3 ...`

## Teil 3 (10 Punkte)

### Aufgabe 5 – Römische Zahlen (7 Punkte)

Implementieren Sie mittels **Rekursion** die Methode `toRoman` innerhalb der Klasse `RomanConverter` (keine **for**-Schleife erlaubt).
Die Methode soll Jahresangaben von arabischer Schreibweise korrekt in römische Schreibweise umrechnen.
Das Equivalent der jeweiligen Zahlen ist als Kommentar neben dem Methodenaufruf zu finden.


### Aufgabe 6 – Die Liste (3 Punkte)

Betrachten Sie den vorhandenen Code in der Datei `UserApp.java`.
Die Applikation soll bekannte Personen einer Strafkolonie in einer Collection speichern.
Dabei sind Personen eindeutig anhand ihres **Namens** zu identifizieren.

Im vorhandenen Code kommt es jedoch zu Duplikaten in der Collection.
Beheben Sie dieses Problem, sodass Namen jeweils nur einmal in der Collection vorkommen.