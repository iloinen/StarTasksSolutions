package star3;

public class Task4_Maximumkereses {

    public static void main(String[] args) {
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};

        int max = numbers[0];

        for (int elem : numbers) {
            if (elem > max) {
                max = elem;
            }
        }

        System.out.println(max);
    }

}
