package star1;

public class Task5_Evszakok {

    public static void main(String[] args) {
        String month = "kiscica";

        switch (month) {
            case "december":
            case "január":
            case "február":
                System.out.println("tél");
                break;
            case "március":
            case "április":
            case "május":
                System.out.println("tavasz");
                break;
            case "június":
            case "július":
            case "augusztus":
                System.out.println("nyár");
                break;
            case "szeptember":
            case "október":
            case "november":
                System.out.println("ősz");
            default:
                System.out.println("nem meghatározható");
        }
    }

}
