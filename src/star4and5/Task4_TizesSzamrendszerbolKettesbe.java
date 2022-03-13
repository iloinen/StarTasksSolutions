package star4and5;

public class Task4_TizesSzamrendszerbolKettesbe {

    public static void main(String[] args) {
        int decimal = 4242;

        long binary = 0;
        long tenPower = 1;

        while (decimal > 0) {
            int digit = decimal % 2;
            binary += (digit * tenPower);
            tenPower *= 10;
            decimal /= 2;
        }

        // --- ellenőrzéshez:

        long binaryShouldBe = 1000010010010L;

        System.out.println(binary == binaryShouldBe);
    }

}
