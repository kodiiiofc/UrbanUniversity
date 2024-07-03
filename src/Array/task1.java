package Array;

public class task1 {
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        for (int i=0; i < array.length; i++) {
            System.out.println(array[array.length - i - 1]);
        }
    }
}
