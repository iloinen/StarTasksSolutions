package star3;

public class Task2_Hatvanyozas {

    public static void main(String[] args) {
        int base = 7, exponent = 5;

        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }

        System.out.println(result);
    }

}
