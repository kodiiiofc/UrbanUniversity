package Abstraction.task1;

public abstract class Instrument {

    private String tune;

    public void setTune(String tune) {
        this.tune = tune;
    }

    public abstract void tune();

    public abstract void play();


}
