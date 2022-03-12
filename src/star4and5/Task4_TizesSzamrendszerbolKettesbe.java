package star4and5;

public class Task4_TizesSzamrendszerbolKettesbe {

    public static void main(String[] args) {
        int decimal = 4242;

        long binary = 0;
        long exponent = 0;

        while (decimal > 0) {
            int digit = decimal % 2;
            binary += (digit * Math.pow(10, exponent++));
            decimal /= 2;
        }

        // --- ellenőrzéshez:

        long binaryShouldBe = 1000010010010L;

        System.out.println(binary == binaryShouldBe);
    }

}
