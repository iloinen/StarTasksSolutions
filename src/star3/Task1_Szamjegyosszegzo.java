package star3;

public class Task1_Szamjegyosszegzo {

    public static void main(String[] args) {
        int number = -5483229;

        int numPos = Math.abs(number);
        int result = 0;

        while (numPos > 0) {
            int digit = numPos % 10;
            result += digit;
            numPos /= 10;
        }

        System.out.println(result);
    }

}
