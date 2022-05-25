package star1;

public class Task1_NullavalNemOsztunk {

    // bossMethod() {
    //      return countA() + countB();
    // }

    /*  UNIT TESZT
            countA()    - egység, tesztelni!
            countB()    - egység, tesztelni!
     */

    /* INTEGRÁCIÓS TESZT
        bossMethod()

        class Person
            Dog dog;    // field
        class Dog
     */

    public static void main(String[] args) {
        /* eredeti megoldás:

        int first = 10;
        int second = 0;

        if (second != 0) {
            System.out.println(first / second);
        } else {
            System.out.println("Nullával nem osztunk!");
        }
        */

        // metódusok hívása:

        System.out.println();
        System.out.println("divideNumbers nevű metódussal:");

        String result1 = divideNumbers(10, 2);      // értéke: "5"
        String result2 = divideNumbers(10, 0);      // értéke: "Nullával nem osztunk!"

        System.out.println(result1);
        System.out.println(result2);
    }


    // megoldás nem-void metódussal - az eredmény szöveg lesz
    public static String divideNumbers(int first, int second) {
        if (second != 0) {
            return "" + (first / second);
        } else {
            return "Nullával nem osztunk!";
        }
    }

}
