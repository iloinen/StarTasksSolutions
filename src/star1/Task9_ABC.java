package star1;

public class Task9_ABC {

    public static void main(String[] args) {
        String expected = "abcdefghijklmnopqrstuvwxyz";

        int n = 26;

        String result = "";

        for (int i = 0; i < n; i++) {
            char letter = (char) ('a' + i);
            result += letter;
        }

        System.out.println(expected.equals(result));
    }

}
