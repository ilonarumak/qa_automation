package Task13;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Бобик", "мясо", "Нью-Йорк", "мяч");
        animals[1] = new Cat("Мурка", "сухой корм", "Лос-Анджелес", "батарея");
        animals[2] = new Horse("Бемби", "сено", "Вашингтон", true);

        VetDoc vetDoc = new VetDoc();

        for (Animal animal : animals) {
            vetDoc.treatAnimal(animal);
        }
    }
}
