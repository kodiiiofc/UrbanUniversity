package StreamAPI2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("в", "начале", "было", "слово",
                                                            "в", "конце", "будет", "слово",
                                                                "всё", "повторяется", "снова",
                                                                    "—", "природа", "сурова"));
        List<String> result = strings.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(strings);
        System.out.println(result);

    }
}
