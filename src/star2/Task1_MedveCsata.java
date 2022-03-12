package star2;

public class Task1_MedveCsata {

    public static void main(String[] args) {
        int hp1 = 150, ap1 = 85;
        int hp2 = 170, ap2 = 75;

        String winner;

        double secondWin = (double) hp1 / ap2;
        double firstWin = (double) hp2 / ap1;

        if (secondWin < firstWin) {
            winner = "második medve";
        } else if (firstWin < secondWin) {
            winner = "első medve";
        } else {
            winner = "döntetlen";
        }

        System.out.println(winner);
    }

}
