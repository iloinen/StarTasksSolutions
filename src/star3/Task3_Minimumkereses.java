package star3;

public class Task3_Minimumkereses {

    public static void main(String[] args) {
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};

        int min = numbers[0];

        for (int elem : numbers) {
            if (elem < min) {
                min = elem;
            }
        }

        System.out.println(min);
    }

}
