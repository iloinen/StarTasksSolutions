package star3;

import java.util.Arrays;

public class Task5_Konvertalas {

    public static void main(String[] args) {
        int[] numbers = {-2, 1, -6, 10};

        String[] result = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }

        System.out.println(Arrays.toString(result));
    }

}
