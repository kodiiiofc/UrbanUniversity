package StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Роман Мохнаткин", 27, Person.Gender.MALE));
        persons.add(new Person("Дарья Мохнаткина", 27, Person.Gender.FEMALE));
        persons.add(new Person("Илья Висков", 26, Person.Gender.MALE));
        persons.add(new Person("Ангелина Вискова", 27, Person.Gender.FEMALE));
        persons.add(new Person("Светлана Аулова", 26, Person.Gender.FEMALE));
        persons.add(new Person("Сергей Аулов", 27, Person.Gender.MALE));
        persons.add(new Person("Леонид Басангов", 30, Person.Gender.MALE));
        persons.add(new Person("Рустам Мулюков", 39, Person.Gender.MALE));
        persons.add(new Person("Вячеслав Мохнаткин", 31, Person.Gender.MALE));
        persons.add(new Person("Александра Мохнаткина", 27, Person.Gender.FEMALE));

        persons.stream()
                .filter(age -> age.getAge() > 30)
                .forEach(System.out::println);

        List<Person> personsFiltered = persons.stream()
                .filter(age -> age.getAge() > 30)
                .toList();

        System.out.println(personsFiltered);


    }
}
