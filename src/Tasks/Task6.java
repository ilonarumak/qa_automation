package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter the ordinal number of the day of the week: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        String selectedDayPhrase = "The selected day of the week: ";
        switch (number) {
            case 0:
                System.out.println(selectedDayPhrase + "Sunday");
                break;
            case 1:
                System.out.println(selectedDayPhrase + "Monday");
                break;
            case 2:
                System.out.println(selectedDayPhrase + "Tuesday");
                break;
            case 3:
                System.out.println(selectedDayPhrase + "Wednesday");
                break;
            case 4:
                System.out.println(selectedDayPhrase + "Thursday");
                break;
            case 5:
                System.out.println(selectedDayPhrase + "Friday");
                break;
            case 6:
                System.out.println(selectedDayPhrase + "Saturday");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}
