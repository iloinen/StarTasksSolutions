package star1;

public class Task8_Faktorialis {

    public static void main(String[] args) {
        int n = 10;

        int factorial = n;

        for (int i = 2; i < n; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }

}
