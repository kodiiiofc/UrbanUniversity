package StreamAPI2;

import java.util.*;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,6,412,831,35,0,31,551,310));
        System.out.println(getSumOfEven(numbers));
        System.out.println(getSumOfOdd(numbers));

    }

    public static int getSumOfEven(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a + b)
                .get();

        return sum;
    }

    public static int getSumOfOdd(List<Integer> numbers) {
        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.summingInt(Integer::intValue));

        return sum;
    }

}
