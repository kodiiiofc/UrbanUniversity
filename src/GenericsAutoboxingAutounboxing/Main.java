package GenericsAutoboxingAutounboxing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings1 = {"Здесь", "Случайный", "Текст"};
        String[] strings2 = {"Здесь", "тоже", "случайный", "текст"};

        String[] strings3 = {"Это", "два", "одинаковых", "массива", "текста"};
        String[] strings4 = {"Это", "два", "одинаковых", "массива", "текста"};

        Integer[] intArray1 = {1, 2, 3, 4};
        Integer[] intArray2 = {2, 12, 513, 33};
        Integer[] intSameArray1 = {5, 6, 7, 1};
        Integer[] intSameArray2 = {5, 6, 7, 1};

        GenericArrays<String> stringGenericArray = new GenericArrays<>(strings1, strings2);
        GenericArrays<Integer> integerGenericArray= new GenericArrays<>(intArray1, intArray2);

        System.out.println(GenericArrays.compare(strings1, strings2));
        System.out.println(GenericArrays.compare(strings3, strings4));
        System.out.println(GenericArrays.compare(intArray1, intArray2));
        System.out.println(GenericArrays.compare(intSameArray1, intSameArray2));

        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));

        GenericArrays.swapEntryAtIndex(strings1, strings2, 2);

        System.out.println(Arrays.toString(strings1));
        System.out.println(Arrays.toString(strings2));

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));

        GenericArrays.swapEntryAtIndex(intArray1, intArray2, 3);

        System.out.println(Arrays.toString(intArray1));
        System.out.println(Arrays.toString(intArray2));



    }
}
