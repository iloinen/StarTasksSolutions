package starExtreme;

public class Task2_Almaszuret {

    public static void main(String[] args) {
        int[] apples = {44, 42, 76, 55, 48, 48, 64, 44, 78, 72, 26, 26};
        int pick = 4;

        int result = 1;
        int maxFruit = 0;

        for (int i = 0; i <= apples.length - pick; i++) {
            int sum = 0;

            for (int j = 0; j < pick; j++) {
                sum += apples[i + j];
            }

            if (sum > maxFruit) {
                maxFruit = sum;
                result = i + 1;
            }
        }

        System.out.println(result);
    }

}
