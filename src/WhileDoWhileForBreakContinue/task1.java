package WhileDoWhileForBreakContinue;

public class task1 {
    public static void main(String[] args) {
        int startValue = 1;
        int endValue = 50;
        int iterator = startValue;
        while (iterator <= endValue) {
            if (iterator % 3 == 0) {
                System.out.println(iterator);
            }
            iterator++;
        }
    }
}
