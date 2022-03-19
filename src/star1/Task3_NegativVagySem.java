package star1;

public class Task3_NegativVagySem {

    public static void main(String[] args) {
        /* eredeti megoldás:

        int number = 0;

        if (number > 0) {
            System.out.println("pozitív");
        } else if (number < 0) {
            System.out.println("negatív");
        } else {
            System.out.println("nulla");
        }*/

        // metódus hívása (és eredmény ellenőrzése):

        String resultPos = negativeOrPositiveOrZero(1);
        String resultNeg = negativeOrPositiveOrZero(-1);
        String resultZero = negativeOrPositiveOrZero(0);

        // az ellenőrzéshez külön metódust írok - ez nem kötelező
        boolean firstResult = isCorrect("pozitív", resultPos);
        boolean secondResult = isCorrect("negatív", resultNeg);
        boolean thirdResult = isCorrect("nulla", resultZero);

        System.out.println("Az első megoldás" + (firstResult ? "" : " nem") + " helyes.");
        System.out.println("A második megoldás" + (secondResult ? "" : " nem") + " helyes.");
        System.out.println("A harmadik megoldás" + (thirdResult ? "" : " nem") + " helyes.");
    }

    public static String negativeOrPositiveOrZero(int number) {
        String result = "nulla";

        if (number > 0) {
            result = "pozitív";
        } else if (number < 0) {
            result = "negatív";
        }

        return result;
    }

    public static boolean isCorrect(String expected, String result) {
        return expected.equals(result);
    }

}
