package Task13;

public class Cat extends Animal {
    String favPlaceToSleep;

    public Cat(String name, String food, String location, String favPlaceToSleep) {
        super(name, food, location);
        this.favPlaceToSleep = favPlaceToSleep;
    }

    public void makeNoise() {
        System.out.println(this.getName() + " мяукает.");
    }

    public void eat() {
        System.out.println(this.getName() + " хрумкает " + this.getFood());
    }

    public String getFavPlaceToSleep() {
        return favPlaceToSleep;
    }

    public void setFavPlaceToSleep(String favPlaceToSleep) {
        this.favPlaceToSleep = favPlaceToSleep;
    }
}
