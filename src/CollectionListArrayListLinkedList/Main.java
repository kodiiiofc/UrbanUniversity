package CollectionListArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        String color1 = "red";
        String color2 = "green";
        String color3 = "black";
        Integer number = 213;
        String nullString = null;

        System.out.println(isObjectInList(color1, colors));
        System.out.println(isObjectInList(color2, colors));
        System.out.println(isObjectInList(color3, colors));
        System.out.println(isObjectInList(number, colors));
        System.out.println(isObjectInList(nullString, colors));

        Integer[] numArray = {1, 5, 31, 33, 78};
        LinkedList<Integer> numbers = new LinkedList<>();
        for (Integer i : numArray) {
            numbers.add(i);
        }
        System.out.println(numbers);
        System.out.println(swapFirstAndLastElements(numbers));

    }

    public static<T> boolean isObjectInList(T object, List list) {
            if (list.indexOf(object) > -1) {
                return true;
            }
            return false;
    }


    public static<T> LinkedList<T> swapFirstAndLastElements(LinkedList<T> linkedList) {
        T firstElement = linkedList.pop();
        T lastElement = linkedList.peekLast();
        linkedList.removeLast();
        linkedList.addFirst(lastElement);
        linkedList.addLast(firstElement);
        return linkedList;
    }

}
