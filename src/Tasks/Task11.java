package Tasks;

public class Task11 {

    public static void main(String[] args) {
        char asterisk = '*';
        for (int i = 1; i < 16; i++) {
            if (i == 5 || i == 10) {
                System.out.println(asterisk);
            }
            else {
                System.out.print(asterisk + " ");
            }
        }
    }
}
