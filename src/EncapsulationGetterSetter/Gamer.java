package EncapsulationGetterSetter;

public class Gamer {
    private String nickname;
    private boolean isActive = false;

    public Gamer(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Gamer{" + nickname + '\'' +
                ", is playing now: " + isActive +
                '}';
    }
}
