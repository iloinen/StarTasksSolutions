package star2;

public class Task4_ElemCsere {

    public static void main(String[] args) {
        char[] chars = {'+', '-', '*', '/', '%'};

        if (chars.length > 1) {
            int last = chars.length - 1;

            char temp = chars[0];
            chars[0] = chars[last];
            chars[last] = temp;
        }
    }

}
