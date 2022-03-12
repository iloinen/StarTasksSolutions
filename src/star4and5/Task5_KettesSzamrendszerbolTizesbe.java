package star4and5;

public class Task5_KettesSzamrendszerbolTizesbe {

    public static void main(String[] args) {
        long binary = 110010011L;

        long decimal = 0;
        long exponent = 0;

        while (binary > 0) {
            int digit = (int) binary % 10;
            decimal += (digit * Math.pow(2, exponent++));
            binary /= 10;
        }

        // --- ellenőrzéshez:

        long decimalShouldBe = 403;

        System.out.println(decimal == decimalShouldBe);

    }

}
