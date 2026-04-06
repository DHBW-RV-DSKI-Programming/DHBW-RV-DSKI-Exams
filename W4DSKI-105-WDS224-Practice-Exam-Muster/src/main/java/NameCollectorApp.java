import java.util.Arrays;
import java.util.LinkedHashMap;

public class NameCollectorApp {

    private static final String[] NAMES = {"Jorah Mormont", "Margaery Tyrell", "Cersei Lannister", "Tyrion Lannister",
            "Arya Stark", "Daenerys Targaryen", "Sansa Stark", "Bran Stark", "Jon Snow", "Tywin Lannister"};

    public static void main(String[] args) {
        LinkedHashMap<String, Boolean> isDeadMainCharacterMap = new LinkedHashMap<>(16, .75f, true); // 2 Punkte
        Arrays.stream(NAMES).forEach(name -> isDeadMainCharacterMap.put(name, false)); // 1 Punkt

        isDeadMainCharacterMap.put("Arya Stark", true); // 1 Punkt
        String output = getRecentItemInList(isDeadMainCharacterMap); // 0,5 Punkte
        isDeadMainCharacterMap.put("Sansa Stark", true); // 1 Punkt
        output += getRecentItemInList(isDeadMainCharacterMap); // 0,5 Punkte
        System.out.println(output); // 0,5 Punkte
    }

    public static String getRecentItemInList(LinkedHashMap<String, Boolean> isDeadMainCharacterMap) { // 0,5 Punkte
        return isDeadMainCharacterMap.keySet().toArray()[isDeadMainCharacterMap.size() - 1].toString() + "\n"; // 1 Punkt
    }

}

// Gesamtpunktzahl: 8 Punkte