package Interfaces;

public class Main {
    public static void main(String[] args) {
        Human romanM = new Human("Роман Мохнаткин", 27);
        Fish fish = new Fish("Лосось", 2);
        Fish nemo = new Fish("Амфиприон", 1);
        nemo.setName("Немо");
        Bird bird = new Bird("Утка", 5);
        Bird kowalski = new Bird("Пингвин", 29);
        kowalski.setName("Ковальски");
        Bird ostrich = new Bird("Страус", 6);
        romanM.fly();
        romanM.swim();
        fish.swim();
        nemo.swim();
        bird.fly();
        bird.swim();
        kowalski.fly();
        kowalski.swim();
        ostrich.fly();
        ostrich.swim();

    }
}
