package star3;

public class Task6_Tukortomb {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 5, 5, 4, 3, 2, 2, 1};

        boolean isMirrorArray = numbers.length > 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            int iFromEnd = numbers.length - 1 - i;

            if (numbers[i] != numbers[iFromEnd]) {
                isMirrorArray = false;
                break;
            }
        }

        System.out.println("Is the array a mirror array? " + isMirrorArray);
    }

}
