package Task13;

public class Horse extends Animal {
    boolean readyForRace;

    public Horse(String name, String food, String location, boolean readyForRace) {
        super(name, food, location);
        this.readyForRace = readyForRace;
    }

    public void makeNoise() {
        System.out.println(this.getName() + " ржет.");
    }

    public void eat() {
        System.out.println(this.getName() + " жует " + this.getFood());
    }

    public boolean isReadyForRace() {
        return readyForRace;
    }

    public void setReadyForRace(boolean readyForRace) {
        this.readyForRace = readyForRace;
    }
}
