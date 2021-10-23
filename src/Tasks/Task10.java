package Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        String[] numberTypes = {"long", "int", "byte", "short", "double", "float"};
        Scanner in = new Scanner(System.in);

        String type = getNumberTypeFromUser(in);
        while (Arrays.stream(numberTypes).noneMatch(type::equals)) {
            System.out.print("Incorrect type! ");
            type = getNumberTypeFromUser(in);
        }

        System.out.printf("Please enter %s number: ", type);
        switch (type) {
            case "long":
            case "int":
            case "byte":
            case "short":
                long longNumber = in.nextLong();
                printSumNumbers(longNumber);
                break;
            case "double":
            case "float":
                double doubleNumber = in.nextDouble();
                printSumNumbers(doubleNumber);
                break;
        }
    }

    private static String getNumberTypeFromUser(Scanner in) {
        System.out.print("Please enter number type: ");
        return in.nextLine();
    }

    private static void printSumNumbers(long number) {
        long sum = getSum(number);
        System.out.printf("The sum of integers from 1 to %d is: %d", number, sum);
    }

    private static void printSumNumbers(double number) {
        long sum = getSum((long) number);
        System.out.printf("The sum of integers from 1 to %.2f is: %d", number, sum);
    }

    private static long getSum(long number) {
        long sum = 0;
        for (long i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
