package Task14;

public class Guitar implements Instrument {
    private int NumberOfStrings;

    public Guitar(int numberOfStrings) {
        NumberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.printf("Гитара c %d струнами играет ноту %s.\n", NumberOfStrings, KEY);
    }

    public int getNumberOfStrings() {
        return NumberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        NumberOfStrings = numberOfStrings;
    }
}
