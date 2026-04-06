# Programmentwurf - Klausur (80 Punkte)

Vorlesung: W4DSKI-103 "Grundlagen Programmierung"

Kurs: WDS224

## Teilbereich 1 - News Publisher App (20 Punkte)

Du bist Junior Java-Softwareentwickler bei der Firma **Schwäbischer Kurier**. **Schwäbischer Kurier** ist ein
Unternehmen, das sich auf die Entwicklung von Software für digitale Nachrichtenplattformen spezialisiert hat.
Das Unternehmen hat eine App entwickelt, die es Nutzern ermöglicht, Nachrichtenartikel zu lesen und zu verwalten.

Am Ende der folgenden Aufgaben soll die Main-Methode in der Klasse [NewsApp](src/NewsApp.java) korrekt ausgeführt
werden.

### Aufgabe 1: Implementiere die Klasse `ArticleCategory` (5 Punkte)

Erstelle die Enum-Klasse mit dem Namen `ArticleCategory`. Eine Artikelkategorie kann die folgenden Werte annehmen:

- `POLITICS`
- `SPORTS`
- `TECHNOLOGY`
- `ENTERTAINMENT`

Achte auf die korrekte Schreibweise. Da der Enum nur im gleichen Paket weiter genutzt wird, soll der Zugriffsmodifikator
`package-private` verwendet werden.

### Aufgabe 2: Implementiere die Klasse `Article` (11 Punkte)

Erstelle die Klasse `Article` mit den folgenden Eigenschaften:

- `title` (`String`)
- `articleCategory` (`ArticleCategory`-Enum)
- `content` (`String`)

Jede dieser Eigenschaften soll nur in der eigenen Klasse direkt verwendet werden können. Verwende dementsprechend den
dafür korrekten Zugriffsmodifikator. Anschließend, erstelle den gleichnamigen Konstruktor der Klasse. Der Konstruktor
der Klasse `Article` initialisiert jede dieser Eigenschaften. Der Zugriff ist hier `package-private`.

Zusätzlich sind zu jeder Eigenschaft entsprechende Getter- und Setter-Methoden zu implementieren. Lege diese an. Achte
dabei auf den korrekten Zugriff durch `package-private` und eine korrekte Schreibweise der Methoden.

### Aufgabe 3: Erweitere die Klasse `NewsPortal` (4 Punkte)

Füge der Klasse `NewsPortal` - bereits angelegt - die Methode mit der Signatur `addArticle(Article article)` hinzu.
Diese Methode:
- Erwartet ein `Article`-Objekt als Parameter und fügt es zur Liste `articles` hinzu.
- Prüft, ob die Liste `articles` bereits initialisiert wurde, und initialisiert sie gegebenenfalls.

Verwende den korrekten Zugriffsmodifikator `package-private` und schreibe die Methode als Prozedur.

## Teilbereich 2 - Konsonantenzähler, 3D-Schach und Drucker-Diamant (40 Punkte)

### Aufgabe 4: Konsonantenzähler (7 Punkte)

Du entwickelst eine Textanalyse-Anwendung, die verschiedene Funktionen zur Analyse von Texten bereitstellt. Eine dieser
Funktionen ist die Zählung der **Konsonanten** in einem Text. Implementiere daher in der Klasse
[TextAnalyzer](src/TextAnalyzer.java) die Methode `static int countConsonant(String text) {}`.

<u>Aufgaben</u>
1. Die Methode zählt und gibt zurück, wie viele Konsonanten (alle Buchstaben bis auf die Vokale `a`, `e`, `i`, `o`, `u`)
insgesamt im übergebenen Text enthalten sind. Im Text werden nur Buchstaben, ohne Umlaute, und Leerzeichen als
Kleinbuchstaben übergeben. Es werden z.B. keine Satzzeichen oder Zahlen übergeben.
2. Falls `null` übergeben wird, soll `-1` zurückgegeben werden.

Die Main-Methode in der Klasse [TextApp](src/TextApp.java) muss nun korrekt funktionieren.

### Aufgabe 5: 3D-Schach (23 Punkte)

Ein Entwicklerteam arbeitet an einer Schach-Engine. Eine zentrale Herausforderung besteht darin, verschiedene
Spielstände zu speichern, um Züge zurückverfolgen oder zurücknehmen zu können. Dazu soll ein **dreidimensionales Array**
verwendet werden, um den Zustand des Schachbretts für zu speichern.

<u>Aufgaben</u>
1. Erstelle die Klasse `ChessBoard` mit dem Zugriffsmodifikator `package-private`
2. Als privates Attribut besitzt `ChessBoard` ein 3D-Array von `Strings`.
3. Implementiere die Methode `void initBoard()` in der Klasse `ChessBoard`, die das Schachbrett mit einer
Standardaufstellung befüllt.
   1. Ein Schachbrett ist ein **8x8**-Array, wobei jede Zelle eine Figur enthalten kann.
      1. `R` für den Turm (engl. Rook)
      2. `N` für den Springer (engl. Knight)
      3. `B` für den Läufer (engl. Bishop)
      4. `Q` für die Dame (engl. Queen)
      5. `K` für den König (engl. King)
      6. `P` für den Bauern (engl. Pawn)
   2. Es soll zusätzlich als dritte Dimension die Farbe der Figur, `"W"` für weiß und `"B"` für schwarz, berücksichtigt
   werden.
   3. Befindet sich keine Figur auf dem Feld, wird der Wert `null` für Figur und Farbe gesetzt.
   4. Die Anordnung der Figuren ist der Ausgabe zu entnehmen.
4. Erstelle eine Methode `printChessBoard()`, die das Schachbrett ausgibt.
   1. Weiße Figuren werden in Großbuchstaben und schwarze Figuren in Kleinbuchstaben ausgegeben.
   2. Leere Felder werden mit einem `x` dargestellt.
   3. Die Zahlen `1-8` und die Buchstaben `a-h` werden als **Koordinaten** ausgegeben.

Die korrekte Ausgabe auf dem Terminal sieht wie folgt aus:
```bash
r n b q k b n r 8
p p p p p p p p 7
x x x x x x x x 6
x x x x x x x x 5
x x x x x x x x 4
x x x x x x x x 3
P P P P P P P P 2
R N B Q K B N R 1
a b c d e f g h
```

Die Main-Methode in der Klasse [ChessApp](src/ChessApp.java) muss am Ende korrekt funktionieren.

### Aufgabe 6: Drucker-Diamant (10 Punkte)

Ein Unternehmen entwickelt eine Software zur Verwaltung von verschiedenen Drucktypen. Dabei gibt es eine gemeinsame
Schnittstelle [Printable](src/Printable.java), die von zwei Klassen, [InkjetPrinter](src/InkjetPrinter.java) und
[LaserPrinter](src/LaserPrinter.java), implementiert wird. Nun soll eine neue Klasse
[MultiFunctionPrinter](src/MultiFunctionPrinter.java) entstehen, die die Klassen `InkjetPrinter` und `LaserPrinter`
kombiniert. Dabei tritt das Diamond-Problem auf, d.h. es ist in Java nicht möglich, von zwei Klassen zu erben.

<u>Hinweis:</u> Das Keyword `default` in der Schnittstelle `Printable` wurde mit Java 8 eingeführt und ermöglicht es,
Methoden in Interfaces zu implementieren.

**Gegebenes Szenario:**

```java
interface Printable {
    
    default void print() {
        System.out.println("Printing...");
    }
    
}

class InkjetPrinter implements Printable {
    
    @Override
    public void print() {
        System.out.println("Printing using an inkjet printer");
    }
    
}

class LaserPrinter implements Printable {
    
    @Override
    public void print() {
        System.out.println("Printing using an laser printer");
    }
    
}

class MultiFunctionPrinter extends InkjetPrinter, LaserPrinter {  // ❌ NICHT ERLAUBT
}
```

**Aufgabe:** Löse das Problem, indem du die Klassen `MultiFunctionPrinter`/ `LaserPrinter`/ `InkjetPrinter` und/ oder
`Printable` so umprogrammierst, dass `MultiFunctionPrinter` Funktionalitäten aus `InkjetPrinter` und `LaserPrinter`
simultan nutzen kann. Es kann dabei jede einzelne Zeile geändert werden. Am Ende müssen folgende Ausgaben auf der
Konsole erscheinen:

```bash
Printing using a multifunction printer
Printing using an inkjet printer
Printing using an laser printer
```

Die Main-Methode in der Klasse [PrintApp](src/PrintApp.java) muss schlussendlich korrekt funktionieren.

## Teilbereich 3 - Optimierung und Bug Hunting (20 Punkte)

### Aufgabe 7: Juristen-Optimierung (12 Punkte)

Eine Jura-Anwendung führt eine zeitaufwendige Berechnung innerhalb der Klasse
[PrisonerClassifier](src/PrisonerClassifier.java) durch. Insbesondere bei einer großen Anzahl von Entscheidungen kann
dies zu einer schlechten Performance führen. Die Methode `lookIfPersonIsGuilty` soll optimiert werden, um die Berechnung
effizienter zu gestalten. Dazu soll ein **Boolean-Flag** mit der Bezeichnung `isPrisoner` verwendet werden.

Nach _Busbee, K.L., 2013. Programming Fundamentals: A Modular Structured Approach Using C++. OpenStax CNX._ kann ein
Flag folgendermaßen definiert werden:

> Any variable or constant that holds data can be used as a flag. You can think of the storage location as a flag pole.
The value stored within the variable conveys some meaning and you can think of it as being the flag. An example might be
a variable named: gender which is of the character data type. The two values normally stored in the variable are: 'F'
and 'M' meaning female and male. Then, somewhere within a program we might look at the variable to make a decision.

Auf Deutsch übersetzt:

> Jede Variable oder Konstante, die Daten enthält, kann als 'Flag' verwendet werden. Man kann sich den Speicherort wie
eine Fahnenstange vorstellen. Der in der Variablen gespeicherte Wert hat eine bestimmte Bedeutung und kann als Flagge
betrachtet werden. Ein Beispiel wäre eine Variable mit dem Namen: Geschlecht, die vom Datentyp Zeichen ist. Die beiden
Werte, die normalerweise in der Variablen gespeichert werden, sind: "F" und "M", also weiblich und männlich. Irgendwo in
einem Programm könnten wir dann die Variable betrachten, um eine Entscheidung zu treffen.

<u>Aufgabe</u>
1. Implementiere eine passende Lösung für das Flag `isPrisoner` in der Klasse `PrisonerClassifier`.
2. Ergänze in der Main-Methode von [LegalApp](src/LegalApp.java) eine Filterung auf das Flag `isPrisoner`.

Die gegebene Klasse `PrisonerClassifier`:
```java
class PrisonerClassifier {

  private final String[] litigationDecisions;

  PrisonerClassifier(String[] litigationDecisions) {
    this.litigationDecisions = litigationDecisions;
  }

  boolean lookIfPersonIsGuilty() {
    boolean isGuilty = false;
    for (String decision : this.litigationDecisions) {
      if (decision.equals("GUILTY")) {
        isGuilty = true;
        break;
      }
    }

    return isGuilty;
  }

}
```

Die Main-Methode in der Klasse [LegalApp](src/LegalApp.java) muss nun korrekt funktionieren und einen zeitlichen
Performance-Gewinn darstellen.

### Aufgabe 8: Fehler in einer Anwendung (8 Punkte)

Ein Unternehmen verwaltet **Bestellungen** über eine Liste. Die Bestellungen aus der Liste werden allerdings nicht
korrekt verarbeitet. Du wurdest beauftragt, den Fehler zu finden und zu beheben.

Gegeben ist die Klasse [Order](src/Order.java):
```java
class Order {

    private String id;
    private String status;

    Order(String id, String status) {
        this.id = id;
        this.status = status;
    }

    String getId() {
        return id;
    }

    String getStatus() {
        return status;
    }

    void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{id='" + id + "', status='" + status + "'}";
    }

}
```

Gegeben ist die folgende Klasse [OrderManager](src/OrderManager.java):
```java
import java.util.ArrayList;
import java.util.List;

class OrderManager {

    private List<Order> orders = new ArrayList<>();

    void addOrder(Order order) {
        orders.add(order);
    }

    void processPendingOrders() {
        for (Order order : orders) {
            if (order.getStatus().equals("PENDING")) {
                System.out.println("Processing order: " + order.getId());
                order.setStatus("COMPLETED");
                orders.remove(order);
            }
        }
    }

    void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
```

**Aufgabe:** Finde den Fehler in der Anwendung und behebe ihn. Die Methode `processPendingOrders` soll alle Bestellungen
mit dem Status `"PENDING"` verarbeiten und den Status auf `"COMPLETED"` setzen. Anschließend sollen die Bestellungen aus
der Liste entfernt werden. Im konkreten Fall sollen vier Bestellungen hinzugefügt, anschließend prozessiert und
schlussendlich aus der Liste entfernt werden.

Die Main-Methode in der Klasse [OrderApp](src/OrderApp.java) muss am Ende korrekt funktionieren.