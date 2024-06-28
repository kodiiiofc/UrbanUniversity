package NestedInner;

import java.time.Instant;

public class Car {
    private String carBrand;
    private int speed;
    private int weight;
    Engine engine;

    public Car(String carBrand, int speed, int weight) {
        this.carBrand = carBrand;
        this.speed = speed;
        this.weight = weight;
        engine = new Engine();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public class Engine {
        private boolean isRunning = false;
        private long motoHours = 0L;
        private long motoMinutes = 0L;
        private long runningMinutes;
        private Instant startEngine;
        private Instant stopEngine;

        public Part piston1 = new Part("Поршень 1", 12000);
        public Part piston2 = new Part("Поршень 2", 12000);
        public Liquid fuel = new Liquid("Топливо", 45, 0.6);
        public Liquid oil = new Liquid("Масло", 5, 0.02);


        public long getMotoMinutes() {
            return motoMinutes;
        }

        private Engine() {
            this.isRunning = false;

        }

        public void startEngine() {
            if (fuel.currentLitre > 0) {
                isRunning = true;
                startEngine = Instant.now();
                System.out.println("Двигатель запущен");
            }
            if (fuel.currentLitre <= 0) {
                System.out.println("Необходимо заправить автомобиль");
            }

        }

        public void stopEngine() {
            isRunning = false;
            stopEngine = Instant.now();
            runningMinutes = (stopEngine.getEpochSecond() - startEngine.getEpochSecond()) / (60);
            motoMinutes += runningMinutes;
            motoHours += runningMinutes / 60;
            System.out.println("Двигатель работал " + runningMinutes + " минут");
            System.out.println("Общее время работы двигателя составляет " + motoHours + " часов и " + motoMinutes % 60 + " минут");
            piston1.motoMinutes = motoMinutes;
            piston2.motoMinutes = motoMinutes;
            fuel.currentLitre = fuel.currentLitre - (int) (fuel.litrePerMinute * runningMinutes);
            System.out.println("Осталось топлива " + fuel.currentLitre);


        }

        public class Liquid {
            String type;
            int tankSizeLitre;
            double litrePerMinute;
            int currentLitre;

            private Liquid(String type, int tankSizeLitre, double litrePerMinute) {
                this.type = type;
                this.tankSizeLitre = tankSizeLitre;
                this.litrePerMinute = litrePerMinute;
                currentLitre = tankSizeLitre;

            }

            public void toFillUp() {
                currentLitre = tankSizeLitre;
                System.out.println("Жидкость заправлена");

            }

            public void check() {
                System.out.println("Сейчас жидкости " + currentLitre + " из " + tankSizeLitre + " литров");
            }

        }

        public class Part {
            private String type;
            private final long lifeTimeMinutes;
            private long motoMinutes;

            public Part(String type, long lifeTimeMinutes) {
                this.type = type;
                this.lifeTimeMinutes = lifeTimeMinutes;
                this.motoMinutes = 0;
            }

            public void check() {
                System.out.println("Тип детали " + type + ". Время работы " + motoMinutes + " минут из ресурсного времени " + lifeTimeMinutes + " минут.");
                if (motoMinutes >= lifeTimeMinutes) {
                    System.out.println("Деталь необходимо заменить.");
                }

            }
        }


    }

}
