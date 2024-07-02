package Enum;

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
        persons.add(new Person("Вячеслав Мохнаткин", 30, Person.Gender.MALE));
        persons.add(new Person("Александра Мохнаткина", 27, Person.Gender.FEMALE));

        System.out.println(persons);

        System.out.println(filterByGender(persons, Person.Gender.FEMALE));

        System.out.println(persons);
    }

    public static List<Person> filterByGender(List<Person> persons, Person.Gender gender) {
        ArrayList<Person> result = new ArrayList<>();

        for (Person person : persons) {
            if (person.getGender().equals(gender)) {
                result.add(person);
            }
        }

        return result;
    }

}
