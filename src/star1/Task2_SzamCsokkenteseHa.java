package star1;

public class Task2_SzamCsokkenteseHa {

    public static void main(String[] args) {
        /* eredeti megoldás:

        int number = -1;

        if (number > 0) {
            number--;
        }

        System.out.println(number);
        */

        // metódus hívása:

        int number1 = decreaseNumber(11);   // értéke: 10
        int number2 = decreaseNumber(1);    // értéke: 0
        int number3 = decreaseNumber(-1);   // értéke: -1

        // ellenőrzés:

        System.out.println("number1 értéke: " + number1);
        System.out.println("number2 értéke: " + number2);
        System.out.println("number3 értéke: " + number3);

    }

    public static int decreaseNumber(int number) {
        if (number > 0) {
            return number - 1;
        } else {
            return number;
        }
    }

}
