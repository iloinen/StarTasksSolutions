package star4and5;

import java.util.Arrays;

public class Task2_SzamOsztoi {

    public static void main(String[] args) {
        int number = 30;

        String divisorString = "1";

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                divisorString += " " + i;
            }
        }

        String[] split = divisorString.split(" ");

        int[] divisors = new int[split.length + 1];

        for (int i = 0; i < split.length; i++) {
            divisors[i] = Integer.parseInt(split[i]);
        }

        divisors[divisors.length - 1] = number;

        System.out.println(Arrays.toString(divisors));

    }

}
