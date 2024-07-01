package MapHashMapTreeMap;

import java.util.HashMap;
import java.util.Map;

public class task2 {
    public static void main(String[] args) {
        HashMap<Integer, String> animals = new HashMap<>();
        animals.put(1, "Мышь");
        animals.put(2, "Крот");
        animals.put(3, "Кот");
        animals.put(4, "Пес");
        animals.put(5, "Курица");
        System.out.println(animals);
        System.out.println(getMapWithValuesLongerThreeSymbols(animals));
    }

    public static Map<Integer, String> getMapWithValuesLongerThreeSymbols(Map<Integer, String> map) {
        Map<Integer, String> result = new HashMap<Integer, String>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 3) {
                result.put(entry.getKey(), entry.getValue());
            }
        }

        return result;
    }
}
