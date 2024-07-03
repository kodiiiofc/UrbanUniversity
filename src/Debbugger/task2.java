package Debbugger;

public class task2 {
    public static void main(String[] args) {
        String string = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println(string);
        System.out.println(swapCase(string));

    }

    public static String swapCase(String string) {
        char[] charArray = string.toCharArray();
        char[] resultCharArray = new char[string.length()];
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (Character.isLowerCase(c)) {
                c = Character.toTitleCase(c);
                resultCharArray[i] = c;
            } else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                resultCharArray[i] = c;
            } else {
                resultCharArray[i] = c;
            }
        }
        return new String(resultCharArray);
    }
}
