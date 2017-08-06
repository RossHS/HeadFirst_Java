package Head_First_Java.Ch16_Collections;

import java.util.HashMap;

/**
 * Created by User on 05.08.2017.
 */
public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<String, Integer>();

        scores.put("Кэти", 42);
        scores.put("Берт", 343);
        scores.put("Скайлер", 420);
        scores.put("Мусик", 520);

        System.out.println(scores);
        System.out.println(scores.get("Берт"));
    }
}
