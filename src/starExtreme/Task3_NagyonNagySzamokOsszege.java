package starExtreme;

/**
 * A megoldás lényege:
 *      Ilyen nagy számokat String adattípusú változó értékének tudunk adni.
 *      Az összeadást teljesen úgy kell elvégezni, mintha papíron adnánk össze a számokat:
 *          a megfelelő helyiértéken lévő számjegyeket adjuk össze, hátulról kezdve
 *          ha a számjegyek összege nagyobb/egyenlő 10-zel, akkor az 1-et átvisszük a következő számjegy-párhoz
 *
 *      Ha az egyik szám kevesebb számjegyből áll, mint a másik, akkor kicsit másképp kell kezelnünk:
 *          - addig adjuk össze a megfelelő helyiértéken lévő számjegyeket (hátulról kezdve, ugye), amíg a "rövidebb" szám tart
 *          - azután a "hosszabb" számot lényegében az összeadás elé illesztjük
 *              de ügyelve arra, hogy maradt-e 1 a legutolsó számjegy-pár összeadásából
 *
 *      Rövid példa: 56 + 5678 = eredmény?
 *          1. lépés: nézem mindkét szám utolsó számjegyét
 *              6 + 8 = 14
 *              az utolsó számjegyekkel már nem foglalkozom
 *                  a két szám most már: 5 és 567
 *              az eredmény: 4
 *              1-et a következőhöz adok majd
 *          2. lépés: nézem mindkét szám új utolsó számjegyét
 *              5 + 7 = 12
 *              az utolsó számjegyekkel már nem foglalkozom
 *                  a két szám most már: (elfogyott) és 56
 *              az összeghez hozzáadom az előzőből maradt 1-et
 *                  tehát 12 + 1 = 13
 *              az eredmény elejére kerül a 3
 *              tehát az eredmény: 34
 *              1-et a következőhöz adok majd
 *          3. lépés: a "rövidebb" szám elfogyott, ezért a "hosszabból" veszem az utolsó számjegyet
 *              az utolsó számjegy: 6
 *              ezzel már nem foglalkozom
 *                  a szám maradék számjegye: 5
 *              hozzáadom az előzőből maradt 1-et
 *                  tehát 6 + 1 = 7
 *              az eredmény elejére kerül a 7
 *              tehát az eredmény: 734
 *              (a következőhöz már nem kell 1-et adnom)
 *          4. lépés: a "hosszabból" is egy számjegy maradt, ami az 5
 *              ez az eredmény elejére kerül
 *              tehát az eredmény: 5734
 *
 *          56 + 5678 = 5734
 *
 * Az alábbiakban ez a folyamat van lekódolva.
 */
public class Task3_NagyonNagySzamokOsszege {

    public static void main(String[] args) {
        String n1 = "19223372036854775807";
        String n2 = "9223372036854775817";

        boolean hasSameLength = (n1.length() == n2.length());

        String[] smaller;
        String[] longer;

        if (hasSameLength || n1.length() < n2.length()) {
            smaller = n1.split("");
            longer = n2.split("");
        } else {
            smaller = n2.split("");
            longer = n1.split("");
        }

        int[] result = new int[longer.length];

        byte addToNext = 0;

        int longerI = longer.length - 1;

        for (int smallerI = smaller.length - 1; smallerI >= 0; smallerI--) {
            int first = Integer.parseInt(smaller[smallerI]);
            int second = Integer.parseInt(longer[longerI]);
            int sum = first + second + addToNext;

            if (sum >= 10) {
                addToNext = 1;
                sum %= 10;
            } else {
                addToNext = 0;
            }

            result[longerI] = sum;
            longerI--;
        }

        if (!hasSameLength) {
            int last = Integer.parseInt(longer[longerI]);
            result[longerI] = last + addToNext;

            while (longerI > 0) {
                longerI--;
                result[longerI] = Integer.parseInt(longer[longerI]);
            }
        }

        // a megoldás már megvan a result nevű tömbben - az elemeit összeolvasva megkapjuk az összeadás eredményét
        // a további sorok csak az ellenőrzés miatt vannak

        // a StringBuilder memória-barátabb módon fűzi össze a String-eket

        StringBuilder resultConcat = new StringBuilder();

        // a for ciklus másik formája: az első elemtől az utolsóig végigmegy a tömbön
        // nincs szükség az index-számra
        for (int number : result) {
            resultConcat.append(number);
        }

        String expected = "28446744073709551624";
        boolean isCorrect = expected.equals(resultConcat.toString());

        // köszönet Ferinek! ;)
        System.out.println("The solution is " + (isCorrect ? "" : "in") + "correct.");
    }

}
