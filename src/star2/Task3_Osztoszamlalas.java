package star2;

public class Task3_Osztoszamlalas {

    public static void main(String[] args) {
        int number = 30;

        int counter = 1;
        double sqrt = Math.sqrt(number);

        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                counter++;
            }
        }

        if (number > 1) {
            counter *= 2;
            if (sqrt == (int) sqrt) {
                counter++;
            }
        }

        System.out.println(counter);
    }

}
