package star2;

public class Task2_Szokoev {

    public static void main(String[] args) {
        int year = 1999;

        boolean isLeapYear = (year >= 1582 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0));

        System.out.println(year + " is leap year? " + isLeapYear);
    }

}
