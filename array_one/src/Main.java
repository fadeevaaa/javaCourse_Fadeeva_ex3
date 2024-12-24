import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 22, 1, 13, 4, 6, 16, 5};

        for (int elem : array) {
            if (elem % 2 == 0) System.out.print(elem + " ");
        }
        System.out.println();

        for (int elem : array) {
            if (elem > 9 && elem < 100) System.out.print(elem + " ");
        }
        System.out.println();

        int max = array[0];
        int sum = 0;
        for (int elem : array) {
            if (elem > max) max = elem;
            sum += elem;
        }
        System.out.println(max);
        System.out.println(sum);

        int middle;
        for (int i = 0; i < array.length / 2; i++) {
            middle = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = middle;
        }
        System.out.println(Arrays.toString(array));
    }
}