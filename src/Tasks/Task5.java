package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] dayOfTheWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the ordinal number of the day of the week: ");
        number = in.nextInt();

        if (number < 7) {
            System.out.println("The selected day of the week: " + dayOfTheWeek[number]);
        } else {
            System.out.println("Invalid number!");
        }
    }
}
