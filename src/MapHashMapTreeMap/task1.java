package MapHashMapTreeMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> regions = new HashMap<>();
        regions.put(56, "Оренбург");
        regions.put(2, "Башкирия");
        regions.put(16, "Татарстан");
        regions.put(63, "Самара");
        System.out.println(keysSet(regions));


    }

    public static<T, V> Set<T> keysSet(HashMap<T, V> hashMap) {
        HashSet result = new HashSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            result.add(entry.getKey());
        }
        return result;
    }



}
