package Task13;

public class VetDoc {

    void treatAnimal(Animal animal) {
        System.out.printf("Пациент: %s (%s)\nЕда: %s\nМестоположение: %s\n\n", animal.getName(),
                animal.getClass().getSimpleName(), animal.getFood(), animal.getLocation());
    }
}
