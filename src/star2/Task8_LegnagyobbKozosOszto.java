package star2;

public class Task8_LegnagyobbKozosOszto {

    public static void main(String[] args) {
        int n1 = 5432, n2 = 2345;

        int smaller = (n1 < n2 ? n1 : n2);
        int bigger = (n1 > n2 ? n1 : n2);

        while (smaller != bigger) {
            int sub = bigger - smaller;

            bigger = (smaller > sub ? smaller : sub);
            smaller = (smaller < sub ? smaller : sub);
        }

        System.out.println(smaller);
    }

}
