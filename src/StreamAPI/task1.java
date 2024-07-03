package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
        List<String> cars = Arrays.asList("BMW", "Lada", "Lancia", "Alfa Rameo", "Land Rover", "Audi", "Honda", "Toyota", "Suzuki", "Dodge", "Ford");
        String prefix = "R";
        int count = (int) cars.stream()
                .filter(s -> s.toLowerCase().startsWith(prefix.toLowerCase()))
                .count();
        System.out.println(count);
    }
}
