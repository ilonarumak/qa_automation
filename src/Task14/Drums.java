package Task14;

public class Drums implements Instrument {
    private String size;

    public Drums(String size) {
        this.size = size;
    }

    public void play() {
        System.out.printf("Барабан %s размера играет ноту %s.\n", size, KEY);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
