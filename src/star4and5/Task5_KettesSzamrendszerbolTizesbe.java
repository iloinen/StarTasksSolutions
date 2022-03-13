package star4and5;

public class Task5_KettesSzamrendszerbolTizesbe {

    public static void main(String[] args) {
        long binary = 110010011L;

        long decimal = 0;
        long twoPower = 1;

        while (binary > 0) {
            int digit = (int) binary % 10;
            decimal += (digit * twoPower);
            twoPower *= 2;
            binary /= 10;
        }

        // --- ellenőrzéshez:

        long decimalShouldBe = 403;

        System.out.println(decimal == decimalShouldBe);

    }

}
