package Tasks;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter three-digit integer: ");
            number = in.nextInt();
        }
        while (String.valueOf(number).length() != 3);

        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;

        System.out.println("Number of hundreds: " + hundreds);
        System.out.println("Number of tens: " + tens);
        System.out.println("Number of units: " + units);

        int sum = hundreds + tens + units;
        System.out.printf("Sum of digits: %d", sum);
    }
}
