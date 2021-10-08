package Tasks;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Please, enter integer " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        in.close();

        int sum = 0;
        System.out.print("\nYour array is: ");
        for (int element : array) {
            System.out.print(element + " ");
            sum += element;
        }

        System.out.println("\nArray sum: " + sum);

        double avg = (double) sum / array.length;
        System.out.println("Average value: " + avg);

        System.out.print("New array is: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                array[i] *= 2;
            }
            System.out.print(array[i] + " ");
        }
    }
}
