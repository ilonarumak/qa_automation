package Task13;

public class Dog extends Animal {
    private String favToy;

    public Dog(String name, String food, String location, String favToy) {
        super(name, food, location);
        this.favToy = favToy;
    }

    public void makeNoise() {
        System.out.println(this.getName() + " лает.");
    }

    public void eat() {
        System.out.println(this.getName() + " грызет " + this.getFood());
    }

    public String getFavToy() {
        return favToy;
    }

    public void setFavToy(String favToy) {
        this.favToy = favToy;
    }
}