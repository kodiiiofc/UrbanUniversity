package EncapsulationGetterSetter;

public class Main {
    public static void main(String[] args) {
        Gamer gamer1 = new Gamer("s1mple");
        Gamer gamer2 = new Gamer("kodiiiofc");
        Gamer gamer3 = new Gamer("vadimnem23");
        Gamer gamer4 = new Gamer("XazaaM");
        Gamer gamer5 = new Gamer("Per4ick");

        gamer2.setActive(true);
        gamer5.setActive(true);

        Gamer[] gamers = {gamer1, gamer2, gamer3, gamer4, gamer5};
        for (Gamer gamer : gamers) {
            if (gamer.isActive()) System.out.println(gamer.getNickname());

        }
    }
}
