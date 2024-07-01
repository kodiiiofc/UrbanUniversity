package SetHashSetLinkedHashSetTreeSet;

import java.util.*;
import java.lang.Number;


public class Main {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add(null);
        set1.add("Желтый");
        set1.add("Синий");
        set1.add("Белый");
        set1.add("Красный");
        set1.add("Черный");

        set2.add(null);
        set2.add("Желтый");
        set2.add("Фиолетовый");
        set2.add("Белый");
        set2.add("Пурпурный");
        set2.add("Черный");

        System.out.println(crossing(set1, set2));

        System.out.println("------------------------------");

        HashSet<Integer> numbersSet1 = new HashSet<>();

        numbersSet1.add(10);
        numbersSet1.add(213);
        numbersSet1.add(23);
        numbersSet1.add(654);
        numbersSet1.add(213);
        numbersSet1.add(7231);
        numbersSet1.add(98);

        specialMath(numbersSet1);

        System.out.println("------------------------------");

        TreeSet<Double> numbersSet2 = new TreeSet<>();

        numbersSet2.add(1.0);
        numbersSet2.add(1.66);
        numbersSet2.add(2.0);
        numbersSet2.add(3.14);
        numbersSet2.add(9999.9999);
        numbersSet2.add(400.0);

        specialMath(numbersSet2);



    }

    public static<T> Set<T> crossing(Set<T> set1, Set<T> set2){
        HashSet<T> resultHashSet = new HashSet<>();
        Iterator<T> i = set1.iterator();
        while (i.hasNext()) {
            T entry = i.next();
            if (set2.contains(entry) && entry != null) {
                resultHashSet.add(entry);
            }
        }
        return resultHashSet;
    }

    public static<T extends Number> void specialMath(Set<T> set) {
        Iterator<T> i = set.iterator();
        while (i.hasNext()) {
            double num = i.next().doubleValue();
            if (num > 15.0 && num % 2.0 == 0) {
                System.out.println(num);
            }
            else {
                System.out.println(num / 2);
            }
        }


    }

}
