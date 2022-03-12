package star2;

public class Task5_ElemCsereHa {

    public static void main(String[] args) {
        int[] numbers =  {2, 1, -4, 3};

        if (numbers.length > 1) {
            if (numbers[0] > numbers[1]) {
                int temp = numbers[0];
                numbers[0] = numbers[1];
                numbers[1] = temp;
            }
        }
    }

}
