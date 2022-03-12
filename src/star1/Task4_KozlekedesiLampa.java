package star1;

public class Task4_KozlekedesiLampa {

    public static void main(String[] args) {
        String light = "kiscica";

        // a JDK 15-ös verziójától kezdve írható így a swtich
        switch (light) {
            case "zöld" -> System.out.println("SZABAD");
            case "sárga" -> System.out.println("LASSÍTS");
            case "piros" -> System.out.println("MEGÁLLJ");
            default -> System.out.println("NEM TUDOM");
        }
    }

}
