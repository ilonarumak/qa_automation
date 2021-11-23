package Task14;

public class Trumpet implements Instrument {
    private int diameter;

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.printf("Труба диаметром %d см играет ноту %s.\n", diameter, KEY);
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
}
