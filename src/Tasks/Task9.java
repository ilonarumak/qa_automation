package Tasks;

public class Task9 {

    public static void main(String[] args) {
        for (int secondMultiplier = 2; secondMultiplier < 10; secondMultiplier++) {
            displayTopMultiplicationTable(secondMultiplier);
        }

        System.out.println(" ");

        for (int secondMultiplier = 2; secondMultiplier < 10; secondMultiplier++) {
            displayBottomMultiplicationTable(secondMultiplier);
        }
    }

    private static void displayTopMultiplicationTable(int secondMultiplier) {
        for (int firstMultiplier = 2; firstMultiplier < 6; firstMultiplier++) {
            printTableRows(secondMultiplier, firstMultiplier);
        }
    }

    private static void displayBottomMultiplicationTable(int secondMultiplier) {
        for (int firstMultiplier = 6; firstMultiplier < 10; firstMultiplier++) {
            printTableRows(secondMultiplier, firstMultiplier);
        }
    }

    private static void printTableRows(int secondMultiplier, int firstMultiplier) {
        String tableRow = firstMultiplier + " x " + secondMultiplier + " = " + (secondMultiplier * firstMultiplier);
        if (firstMultiplier == 5 || firstMultiplier == 9) {
            System.out.println(tableRow);
        } else {
            System.out.print(tableRow + "\t\t");
        }
    }
}
