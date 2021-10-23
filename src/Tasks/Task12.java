package Tasks;

public class Task12 {

    public static void main(String[] args) {
        int[] numFibonacci = new int[11];
        numFibonacci[0] = 1;
        numFibonacci[1] = 1;

        for (int i = 2; i < 11; i++) {
            numFibonacci[i] = numFibonacci[i - 1] + numFibonacci[i - 2];
        }

        System.out.println("The first " + numFibonacci.length + " fibonacci numbers: ");
        for (int element : numFibonacci) {
            System.out.print(element + " ");
        }
    }
}
