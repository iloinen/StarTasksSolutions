package star4and5;

import java.util.Arrays;

public class Task1_RandomTomb {

    public static void main(String[] args) {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * array.length);

            int temp = array[random];
            array[random] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

}
