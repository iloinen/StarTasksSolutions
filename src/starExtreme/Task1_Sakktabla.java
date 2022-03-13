package starExtreme;

public class Task1_Sakktabla {

    public static void main(String[] args) {
        char white = '-';
        char black = '@';

        String spaces = "   ";
        String letters = spaces + " ";

        for (char a = 'A'; a <= 'H'; a++) {
            letters += a;

            if (a < 'H') {
                letters += " ";
            }
        }

        String table = letters + "\n" + spaces;

        for (int i = spaces.length() + 1; i <= letters.length(); i++) {
            table += "-";
        }

        for (int i = 0; i < 8; i++) {
            table += "\n" + (8 - i) + " |";

            for (int j = 0; j < 8; j++) {
                table += " ";

                if (i % 2 == j % 2) {
                    table += white;
                } else {
                    table += black;
                }
            }
        }

        System.out.println(table);
    }

}
