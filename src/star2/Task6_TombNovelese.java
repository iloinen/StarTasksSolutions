package star2;

import java.util.Arrays;

public class Task6_TombNovelese {

    public static void main(String[] args) {
        int[] numbers = {-33, 66, 42, -13, 54, 89};
        int newElement = 0;

        int[] increased = new int[numbers.length + 1];

        for (int i = 0; i < numbers.length; i++) {
            increased[i] = numbers[i];
        }

        increased[numbers.length] = newElement;

        numbers = increased;

        System.out.println(Arrays.toString(numbers));
    }

}
