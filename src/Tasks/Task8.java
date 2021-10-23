package Tasks;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter three-digit integer: ");
            number = in.nextInt();
        }
        while (String.valueOf(number).length() != 3);

        int sum = calculateSumDigits(number);
        System.out.printf("Sum of digits: %d", sum);
    }

    public static int calculateSumDigits(int number) {
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println("Number of hundreds: " + hundreds);
        System.out.println("Number of tens: " + tens);
        System.out.println("Number of units: " + units);

        return hundreds + tens + units;
    }
}
