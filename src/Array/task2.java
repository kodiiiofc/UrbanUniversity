package Array;

import java.util.Arrays;
import java.util.Comparator;

public class task2 {
    public static void main(String[] args) {
        Double[] array = {3.6, 87.1, 12.41, 98.13, 2.6, 4.005, 66.1};
        Arrays.sort(array, Comparator.comparing(Double::doubleValue).reversed());
        System.out.println(Arrays.toString(array));
    }
}
