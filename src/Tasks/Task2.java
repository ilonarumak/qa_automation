package Tasks;

public class Task2 {

    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i;
        }

        for (int j = arr1.length - 1; j >= 0; j--) {
            int i = arr1.length - j - 1;
            arr2[i] = arr1[j];
        }

        for (int element : arr2) {
            System.out.print(element + " ");
        }
    }
}
