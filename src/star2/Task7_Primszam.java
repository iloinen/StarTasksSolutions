package star2;

public class Task7_Primszam {

    public static void main(String[] args) {
        int number = 2147483647;

        boolean isPrime = (number >= 2);

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + " is prime? " + isPrime);
    }

}
