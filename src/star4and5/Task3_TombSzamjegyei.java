package star4and5;

public class Task3_TombSzamjegyei {

    public static void main(String[] args) {
        int[] numbers = {-1526446364, 1874047238, 1064541050, -815818089, 467498070, -1427103238, 1267273266,
                -1248819505, 839131004, -1313719080, 1545523494};

        int[] result = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            int current = Math.abs(numbers[i]);

            if (current == 0) {
                result[0] += 1;
            } else {
                while (current > 0) {
                    int digit = current % 10;
                    result[digit] += 1;
                    current /= 10;
                }
            }
        }

        // --- ellenőrzéshez:

        for (int i = 0; i < result.length; i++) {
            System.out.println(i + " számjegy ennyiszer szerepel: " + result[i]);
        }
    }

}
