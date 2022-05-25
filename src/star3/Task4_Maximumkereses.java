package star3;

public class Task4_Maximumkereses {

    public static void main(String[] args) {
        int[] numbers = {-104, -442, -422, -66, -333, -103, -89, -66, -501, -316, -114};
        int max1 = max(new int[]{1, 2, 3}); // 3
        int max2 = max(null);
        int max3 = max(new int[0]);

        double avg = (double) (max1 + max2 + max3) / 3;
        double d = 3.0;
        double e = 3D;
    }

    /*
        elvárások:
            NE kezelje, ha a tömb null vagy 0 hosszú - azaz: Exception
            találja meg a tömb legnagyobb értékű elemét
            méghozzá pozíciótól független
     */
    public static int max(int[] numbers) {
       /* if (numbers == null || numbers.length == 0) {
            return Integer.MIN_VALUE;
        }*/

        int max = numbers[0];       // !!!

        for (int elem : numbers) {
            if (elem > max) {
                max = elem;
            }
        }

        return max;
    }

}
