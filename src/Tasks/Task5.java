package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter the ordinal number of the day of the week: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        if (number < 7) {
            System.out.println("The selected day of the week: " + weekDays[number]);
        } else {
            System.out.println("Invalid number!");
        }
    }
}
