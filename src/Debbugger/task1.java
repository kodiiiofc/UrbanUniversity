package Debbugger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class task1 {
    public static void main(String[] args) {
        int[] array = new int[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(getMaxOfEven(array));

    }

    public static int getMaxOfEven(int[] array) {
        IntStream stream = Arrays.stream(array);
        return stream.filter(n -> n % 2 == 0)
                .max()
                .getAsInt();
    }
}
