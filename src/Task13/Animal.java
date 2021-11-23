package Task13;

public abstract class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println(name + " животное спит.");
    }

    public void eat() {
        System.out.println(name + " ест");
    }

    public void sleep() {
        System.out.println(name + " засыпает.");
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
