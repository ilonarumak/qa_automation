package Tasks;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        int[] array = new int[10];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Please, enter integer " + (i + 1) + ": ");
            array[i] = in.nextInt();
        }
        in.close();

        System.out.print("\nYour array is: ");
        printArray(array);

        int sum = calculateArraySum(array);
        System.out.println("\nArray sum: " + sum);

        double avg = (double) sum / array.length;
        System.out.println("Average value: " + avg);

        int[] newArray = doubleArray(array, avg);

        System.out.print("New array is: ");
        printArray(newArray);
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    public static int calculateArraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static int[] doubleArray(int[] array, double avg) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg) {
                array[i] *= 2;
            }
        }
        return array;
    }
}