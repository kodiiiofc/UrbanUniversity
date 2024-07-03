package Lambda;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 5, 3, 1, 14, 989, 321, 337, 8765));
        NumFilter even = NumberFilter::isEven;
        System.out.println(sumIf(list, even));
    }


    public static int sumIf(List<Integer> list, NumFilter filter){
        int result = 0;
        for (Integer number : list) {
            result += filter.filter(number);
        }
        return result;
    }
}

class NumberFilter {
    public static int isEven(int num){
        if (num % 2 == 0) return num;
        else return 0;
    }
}


@FunctionalInterface
interface NumFilter {
    int filter(int num);
}
