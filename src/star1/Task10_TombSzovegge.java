package star1;

public class Task10_TombSzovegge {

    public static void main(String[] args) {
        String expected = "[-33, 66, 42, -13, 54, 89]";

        int[] numbers = {-33, 66, 42, -13, 54, 89};

        String result = "[";

        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];

            if (i < numbers.length - 1) {
                result += ", ";
            }
        }

        result += "]";

        System.out.println(expected.equals(result));
    }

}
