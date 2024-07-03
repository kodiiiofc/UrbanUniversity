package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("Привет", "Мир", "Дом", "Собака", "English", "321fa", "@,.5"));
        StringFilter stringFilter = (list) -> {
            String str = list.get(1);
            for (String s : list) {
                if (s.length() > str.length()) str = s;
            }
            return str;
        };

        System.out.println(stringFilter.filter(strings));


    }
}


interface StringFilter {
    String filter(List<String> list);
}
