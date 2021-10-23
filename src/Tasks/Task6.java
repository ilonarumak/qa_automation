package Tasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int number;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the ordinal number of the day of the week: ");
        number = in.nextInt();

        switch (number) {
            case 0:
                System.out.println("The selected day of the week: Sunday");
                break;
            case 1:
                System.out.println("The selected day of the week: Monday");
                break;
            case 2:
                System.out.println("The selected day of the week: Tuesday");
                break;
            case 3:
                System.out.println("The selected day of the week: Wednesday");
                break;
            case 4:
                System.out.println("The selected day of the week: Thursday");
                break;
            case 5:
                System.out.println("The selected day of the week: Friday");
                break;
            case 6:
                System.out.println("The selected day of the week: Saturday");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }
}
