package javaexample;

public class Duck extends Animal implements Flying{

    boolean hasHat;

    public Duck(boolean hasHat) {
        this.hasHat = hasHat;
    }

    public boolean isHasHat() {
        return hasHat;
    }

    public void setHasHat(boolean hasHat) {
        this.hasHat = hasHat;
    }

    @Override
    public String eat() {
        return "Duck is eating";
    }

    @Override
    public String drinks() {
        return "Duck is drinking";
    }

    @Override
    public String fly() {
        return "Yeay im flying";
    }
}
