package Task14;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Drums("small");
        instruments[1] = new Guitar(6);
        instruments[2] = new Trumpet(10);

        for (Instrument instrument : instruments){
            instrument.play();
        }
    }
}
