# W4DSKI-105-WDS224-Practice-Exam

Dauer: 60 Minuten

## Teil 1 (20 Punkte)

### Aufgabe 1 – Unvorhergesehene Instrumente (12 Punkte)

In der Klasse `PhilharmonicApp` soll eine Datei von Instrumenten auf Bekanntheit geprüft werden.
Folgende Teilaufgaben müssen dabei erfüllt sein:
- Die Text-Datei in `data/InstrumentList.txt` muss eingelesen werden
- Eine `UnknownInstrumentException` wird im Package `net.neue_philharmonie` angelegt.
  - Der Exception wird die Fehlermeldung im Konstruktor übermittelt
  - Zusätzlich werden im Konstruktor die unbekannten Elemente übergeben, welche anschließend in einem Attribut der Klasse gespeichert und durch eine Getter-Methode bereitgestellt werden.
- Die Exception wird ausgelöst, wenn **1** oder **mehrere** unbekannte Instrumente in der Text-Datei vorhanden sind
- Die Fehlermeldung muss die Namen der unbekannten Instrumente enthalten, ansonsten ist diese frei wählbar.
- Im Fehlerfall wird die Fehlermeldung auf der Konsole ausgegeben. Das logische Handling im Fehlerfall ist <u>nicht</u> Teil dieser Aufgabe.

### Aufgabe 2 – Namenssammlung (8 Punkte)

In der Klasse `NameCollectorApp` werden die Namen von _Game Of Thrones_ Charakteren in einem Array gespeichert.
Finde eine passende `Collection`-Klasse in welcher neben dem Namen des jeweiligen Charakters auch sein Zustand - _tot oder lebendig_ - abgerufen werden kann.
Des Weiteren ist eine Anforderung an die entsprechende Collection-Klasse, dass bei Zugriff die Sammlung entsprechend sortiert wird.

Teilaufgaben:
- Eine passende Collection-Klasse finden.
- Collection mit Namen und dem Zustand _lebendig_ als `Boolean` initialisieren.
- Es werden die Charaktere `Arya Stark` und `Sansa Stark` nacheinander ausgelöscht.
- In der zu implementierenden Methode `getRecentItemInList` wird das letzte genutzte Element in der Sammlung aufgerufen und zurückgegeben.
  - Dieses Element wird anschließend einem zu Beginn bestehenden `String`-Objekt hinzugefügt
- Die Endausgabe des `String`-Objektes lautet wie folgt

```
Arya Stark
Sansa Stark
```

## Teil 2 (20 Punkte)

### Aufgabe 3 – Warenlager (7 Punkte)

Im Package `de.good_stock` sind die Klassen `Product`, `Clothing` und `Electronics` gegeben.

Erstelle die generische Klasse `ProductInventory`, welche Klassen des Typs `Product` und dessen Subtypen zulässt.
Die Klasse speichert die generischen Produkte im Attribut `products`, einer `List` welche als `ArrayList` initialisiert wird.

Ferner implementiere die Methode `findProductByCategory`, welche durch einen Kategorie-Parameter (vom Typ `String`) ein passendes Produkt findet.
Da es vorkommen kann, dass kein passendes Produkt zur Kategorie gefunden wird, gebe als `Optional` zurück.

Ergänze die Klasse `ProductInventory` schlussendlich um folgenden Code:

```java
public void addProduct(T newItem) {
  products.add(newItem);
}
```

Und ergänze in der Main-Methode von `InventoryApp` den folgenden Code:

```java
ProductInventory<Product> inventory = new ProductInventory<>();

inventory.addProduct(new Electronics("E001", "Smartphone", "Mobile", 599.99, "Apple", 12));
inventory.addProduct(new Clothing("C001", "Shirt", "Clothing", 19.99, "Large", "Black"));
inventory.addProduct(new Product("P001", "Cola", "Drink", 1.99));

Optional<Product> productOpt = inventory.findProductByCategory("Drink");
productOpt.ifPresent(product -> System.out.println("Stats: " + product));
```

Am Ende muss folgende Ausgabe auf der Konsole erscheinen:

```
Stats: Product{id='P001', name='Cola', category='Drink', price=1.99}
```

### Aufgabe 4 – Sortierung von Mitarbeitern (13 Punkte)

Im Package `app.hrscout.www` ist der Record `Employee` gegeben, welcher in der main-Methode der `EmployeeApp` genutzt wird, um eine Liste von Beschäftigten zu füllen.
Die Liste von Beschäftigten soll auf drei unterschiedliche Möglichkeiten sortiert und jeweils direkt nach der Sortierung ausgegeben werden:

1. Sortiert nach dem Gehalt absteigend (höchstes Gehalt zum niedrigsten Gehalt). Die Sortierung muss mittels Lambda-Expression erfolgen.
2. Sortiert nach dem Einstellungsdatum (jüngstes Datum zuerst). Die Sortierung muss mittels Lambda-Expression erfolgen.
3. Primäre Sortierung nach der Abteilung (alphabetisch), sekundär nach dem Gehalt (höheres Gehalt zuerst) und tertiär nach Einstellungsdatum (jüngstes Datum zuerst).
Die Sortierung muss mittels eigener `Comparator`-Klasse mit dem Namen `EmployeeComparator` erfolgen.

## Teil 3 (10 Punkte)

### Aufgabe 5 – Kategorientiefe im Online-Shop (8 Punkte)

Im Online-Shop `CineVerse` soll die maximale Tiefe der Kategorien berechnet werden.
Die Kategorien sind dabei in dem Record `Category` gespeichert, welcher immer einen Namen und ein Array von Sub-Kategorien enthält.
Um die maximale Tiefe zu berechnen, muss der längste Pfad von der Hauptkategorie bis zur letzten Unterkategorie gefunden werden.

Schreibe eine Methode `calculateMaxDepth` innerhalb der Klasse `ShopApp`, welche die tiefste Verschachtelung einer Kategorie als `int`-Variable zurückgibt.
Für die Lösung muss zwingend Rekursion genutzt werden.

Eine Beispiel-Kategorie-Struktur ist in der `ShopApp`-Klasse bereits gegeben.

### Aufgabe 6 – Bug in der Datei (2 Punkte)

In der Klasse `LabReportApp` soll ein Text in der Datei `data/LabReport.txt` ausgegeben werden.
Dies findet jedoch nicht vollends korrekt statt.
Finde den Fehler und behebe ihn, sodass der Text `"Patient's blood test results show normal values within the reference range."` in der Datei ohne Fehler ausgegeben wird.