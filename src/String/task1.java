package String;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        String[] stringArray = {"ab", "cd", "ef"};
        String string = Arrays.stream(stringArray).reduce((a,b) -> a + b).get();
        char[] charArray = string.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}
