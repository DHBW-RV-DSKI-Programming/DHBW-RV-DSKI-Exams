# W4DSKI-103 - Grundlagen Programmierung - Wiederholprüfung

Kurs: WDS224

## Teilbereich 1 (40 Punkte)
## Aufgabe 1 - Hogwarts (11 Punkte)

Vervollständige die `main`-Methode in der Klasse `HogwartsApp` so, dass die Anwendung die folgenden Anforderungen erfüllt:
- Zuerst soll eine Variable des Typs `HogwartsHouse` (_Enum_ dazu bereits angelegt) deklariert und mit dem Enum-Wert `RAVENCLAW` initialisiert werden.
- Anschließend soll mithilfe eines `switch`-Statements das jeweilige Haus entschieden werden. Folgende Konsolenausgaben müssen je nach `case`-Statement erfolgen:
  - `Ravenclaw`: `"You are wise and disciplined."`
  - `Gryffindor`: `"You are brave and empathetic."`
  - `Slytherin`: `"You are ambitious and cunning."`
- Es gibt <u>keine</u> Default-Option.
- Achte darauf, dass es zu keinen sogenannten _Fallthroughs_ kommt.
- Auf der Konsole muss die Ausgabe `"You are wise and disciplined."` erscheinen.

## Aufgabe 2 - Die Antwort auf das Leben (8 Punkte)

Vervollständige die `main`-Methode in der Klasse `AnswerToLife` so, dass die Anwendung die folgenden Anforderungen erfüllt:

- Zuerst soll eine `for`-Schleife deklariert werden, die von `1` (inklusiv) bis `50` (exklusiv) iteriert.
- Innerhalb der Schleife soll geprüft werden, ob die aktuelle _counter_-Variable der Schleife **gerade** oder **ungerade** ist.
- Wenn die _counter_-Variable **gerade** ist, soll `"[Zahl] is even."` ausgegeben werden (z.B. `4 is even.`).
- Wenn die _counter_-Variable **ungerade** ist, soll `"[Zahl] is uneven."` ausgegeben werden (z.B. `3 is uneven.`).
- Erreicht die Schleife die Zahl `42`, soll keine Ausgabe, ob gerade oder ungerade erfolgen, sondern folgendes auf der Konsole ausgegeben werden: `"You have reached the answer to life, the universe, and everything."` Anschließend soll die Schleife abgebrochen werden.

## Aufgabe 3 - Film (10 Punkte)

Vervollständige die Klasse `Movie` (Datei `Movie.java` bereits angelegt!), sodass die Anwendung die folgenden Anforderungen erfüllt:
- Die Klasse `Movie` muss den Zugriffsmodifikator `package-private` besitzen.
- Die Klasse `Movie` muss die Attribute `title` (String), `director` (String), `releaseYear` (int) und `rating` (double) besitzen. Die Attribute müssen den Zugriffsmodifikator `private` besitzen.
- Die Klasse `Movie` muss einen Konstruktor besitzen, der alle Attribute initialisiert. Der Konstruktor muss den Zugriffsmodifikator `package-private` besitzen.
- Die Klasse `Movie` muss die Getter-Methoden `getTitle()`, `getDirector()`, `getReleaseYear()` und `getRating()` besitzen. Die Getter-Methoden müssen den Zugriffsmodifikator `package-private` besitzen.

## Aufgabe 4 - Neue Bezahlmethode (11 Punkte)

Vervollständige das Interface `PaymentMethod` (Datei `PaymentMethod.java` bereits angelegt!), sodass die Anwendung die folgenden Anforderungen erfüllt:
- Füge die Methode `pay` hinzu mit dem Rückgabetyp `void` und dem Parameter `double amount` (normale Interface-Methode ohne Methodenkörper).
- Füge die Methode `refund` hinzu mit dem Rückgabetyp `void` und dem Parameter `double amount` (normale Interface-Methode ohne Methodenkörper).

Vervollständige anschließend die Klasse `Wero` (Datei `Wero.java` bereits angelegt!), sodass die Anwendung die folgenden Anforderungen erfüllt:
- Die Klasse `Wero` muss das Interface `PaymentMethod` implementieren.
- Die Klasse `Wero` muss die Methode `pay` implementieren, die folgendes auf der Konsole ausgibt: `"Paid: [amount]"`
  - `[amount]` ist der Betrag, der als Parameter übergeben wird.
- Die Klasse `Wero` muss die Methode `refund` implementieren, die folgendes auf der Konsole ausgibt: `"Refunded: [amount]"`
  - `[amount]` ist der Betrag, der als Parameter übergeben wird.

## Teilbereich 2 (40 Punkte)
## Aufgabe 5 - Wort-Zähler (8 Punkte)

Vervollständige die Methode `countSpecificWord` in der Klasse `WordCounter` (Datei `WordCounter.java` bereits angelegt!), sodass die Anwendung die folgenden Anforderungen erfüllt:
- Wird ein `Array` ohne Elemente übergeben, muss `-1` zurückgegeben werden.
- Es kann vorkommen, dass `null`-Werte im `Array` vorkommen. Diese müssen ignoriert werden.
- Die Methode muss die Anzahl der Vorkommen des Wortes `"java"` im `Array` zurückgeben. Die Überprüfung achtet dabei auf Groß- und Kleinschreibung, das heißt, dass z.B. `"Java"` nicht gezählt wird.
- Die korrekte Ausgabe auf der Konsole muss wie folgt aussehen:

```
Result 1: 0
Result 2: -1
Result 3: 3
```

## Aufgabe 6 - Payroll (23 Punkte)

Die Aufgabe besteht darin ein kleines Programm zu schreiben, das die Gehälter von Mitarbeitern in einem Unternehmen berechnet.
Folgende Anforderungen müssen dabei erfüllt werden:
- Das Interface `Employee` (Datei `Employee.java` bereits angelegt!) muss die Methode `calculateSalary` mit dem Rückgabetyp `double` besitzen (normale Interface-Methode ohne Methodenkörper).
- Die Klasse `ManagingDirector` (Datei `ManagingDirector.java` bereits angelegt!) muss das Interface `Employee` und die Methode `calculateSalary` implementieren.
  - Die Klasse `ManagingDirector` muss die Attribute `baseSalary` (double) und `bonus` (double) besitzen. Die Attribute müssen den Zugriffsmodifikator `private` besitzen.
  - Die Klasse `ManagingDirector` muss einen Konstruktor besitzen, der die Attribute `baseSalary` und `bonus` initialisiert.
  - Die Methode `calculateSalary` muss die Summe von `baseSalary` und `bonus` zurückgeben.
- Der Record `SoftwareDeveloper` (Datei `SoftwareDeveloper.java` bereits angelegt!) muss das Interface `Employee` und die Methode `calculateSalary` implementieren.
  - Der Record `SoftwareDeveloper` muss die Attribute `salary` (double) und `efficiencyFactor` (double) besitzen.
  - Die Methode `calculateSalary` muss die Berechnung aus `salary * efficiencyFactor` zurückgeben.
- Die `main`-Methode in der Klasse `PayrollApp` (Datei `PayrollApp.java` bereits angelegt!) muss die folgenden Anforderungen erfüllen:
  - Es wird ein neues Objekt des Records `SoftwareDeveloper` mit den Werten `5000.0` und `1.2` initialisiert, das Objekt wird in der Variable `softwareDeveloper` gespeichert - die Variable muss von Typ `Employee` sein.
  - Es wird ein neues Objekt der Klasse `ManagingDirector` mit den Werten `10000.0` und `2000.0` initialisiert, das Objekt wird in der Variable `managingDirector` gespeichert - die Variable muss von Typ `Employee` sein.
  - Die Methode `calculateSalary` wird für beide Objekte aufgerufen und die Ergebnisse werden auf der Konsole ausgegeben. Die Ausgabe muss wie folgt aussehen:

```
Software Developer Salary: 6000.0
Managing Director Salary: 12000.0
```

## Aufgabe 7 - Buchnamen (9 Punkte)

Eine Bibliotheksanwendung soll um eine neue Funktionalität erweitert werden, die es ermöglicht, Bücher zu suchen.
Die Anwendung soll die folgenden Anforderungen erfüllen:
- Die Klasse `LibraryManager` (Datei `LibraryManager.java` bereits angelegt!) muss die Methode `searchBooks` besitzen.
  - Die Methode `searchBooks` gibt eine `ArrayList` von Buchnamen zurück, die den Suchbegriff enthalten.
  - Der Methode übergeben wird der Suchbegriff als `String`.
  - Enthält der Buchname den Suchbegriff, wird er in die `ArrayList` aufgenommen.
  - Die Suche ist case-sensitiv, das heißt Groß- und Kleinschreibung werden berücksichtigt - es spielt daher eine Rolle, ob der Suchbegriff z.B. `"Harry"` oder `"harry"` ist.
- Die `main`-Methode in der Klasse `LibraryApp` (Datei `LibraryApp.java` bereits angelegt!) muss die folgenden Anforderungen erfüllen:
  - Es wird ein neues Objekt der Klasse `LibraryManager` instanziiert und mit der vorgegebenen Liste von Buchnamen befüllt.
  - Die Methode `searchBooks` wird aufgerufen und der Suchbegriff `"Lord"` übergeben.
  - Die Ergebnisse werden in der Konsole ausgegeben. Die Ausgabe muss wie folgt aussehen:

```
Found books: [The Lord of the Rings - The Fellowship of the Ring, The Lord of the Rings - The Two Towers, The Lord of the Rings - The Return of the King, Lord of the Flies]
```

## Teilbereich 3 (20 Punkte)
## Aufgabe 8 - Rabatt-Berechnung (14 Punkte)

Im Record `ShoppingCart` existiert bereits die Methode `totalPrice`, die den Gesamtpreis anhand der Attribute `quantity` und `pricePerItem` berechnet.
Die Berechnung des Gesamtpreises erfolgt mithilfe des Datentyps `BigDecimal`, um Centbeträge genau darzustellen.
Vom Projektmanager wird nun die Anforderung gestellt, dass der Gesamtpreis auch mit Rabatt-Codes berechnet werden kann.
Gültige Rabatt-Codes sind: `SUMMER10` mit 10 % Rabatt und `WINTER20` mit 20 % Rabatt.
Ungültige Rabatt-Codes sollen ignoriert, d.h. mit 0 % Rabatt behandelt werden.
Generell kann der Gesamtpreis mit Rabatt wie folgt berechnet werden: `Gesamtpreis * (1 - Rabatt)`.
Der Software-Architekt des Konzerns stellt bei der Implementierung zusätzliche Anforderungen:
- Der bestehende Code im Record `ShoppingCart` soll <u>nicht</u> verändert werden.
- Die Implementierung der Berechnung des Gesamtpreises mit Rabatt-Codes soll mithilfe von _Method Overloading_ erfolgen, um die Lesbarkeit des Codes beizubehalten. Der Rabatt-Code soll als `String` übergeben werden. Die Berechnung und der Rückgabewert sollen weiterhin vom Typ `BigDecimal` sein.

Löse gemäß der Anforderungen des Projektmanagers und des Software-Architekten.
Ergänze am Ende in der `main`-Methode der Klasse `WalmartApp` den Aufruf der Methode mit dem Rabatt-Code `SUMMER10` und gebe das Ergebnis auf der Konsole aus.
Die Ausgabe muss wie folgt aussehen:

```
Total Price: 100.0
Total Price with discount: 90.0
```

Hinweise zum Datentyp `BigDecimal`:
- `BigDecimal` ist eine Klasse in Java, die für die präzise Darstellung von Zahlen mit Dezimalstellen verwendet wird.
- Eine neue Instanz von `BigDecimal` kann mit dem Konstruktor `new BigDecimal(String)` erstellt werden. Dieser Konstruktor erwartet einen `String`-Wert, der die Zahl darstellt.
- Um mit `BigDecimal` zu rechnen, werden Methoden wie `add`, `subtract`, `multiply` und `divide` verwendet. Diese Methoden geben ebenfalls eine neue Instanz von `BigDecimal` zurück.
- Für Werte wie `0` oder `1` können die Konstanten `BigDecimal.ZERO` und `BigDecimal.ONE` verwendet werden.

## Aufgabe 9 - Bugfixing (6 Punkte)

In der Klasse `GalacticDatabase` kommt es zu einem Fehler, wodurch die Ausgabe nicht wie gewünscht erfolgt, sondern `Information locked.` auf der Konsole erscheint.
Finde den Fehler und behebe ihn, sodass bei Namen mit demselben Werten - wie hier `Captain Rex` - die folgende Ausgabe erfolgt:

```
Clone CT-7567, also known as Captain Rex, is a clone trooper who served in the Grand Army of the Republic during the Clone Wars.
```
