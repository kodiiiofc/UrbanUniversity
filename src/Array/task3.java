package Array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class task3 {
    public static void main(String[] args) {
        int[] array = {6, 117, 44, 5, 32, 81, 9};
        IntStream intStream = Arrays.stream(array);
        intStream.filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
