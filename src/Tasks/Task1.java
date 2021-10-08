package Tasks;

public class Task1 {

    public static void main(String[] args){
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++){
            array[i] = (int)Math.pow(i, 2);
        }

        for (int element: array) {
            if (element % 3 == 0 || element % 7 == 0) {
                element = 0;
            }
            System.out.print(element + " ");
        }
    }
}
