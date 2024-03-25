package yazid.week1_tasks;


public class finra {
    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if (number % 3 == 0 && number % 5 == 0) {
            result = "FINRA";
        } else if (number % 5 == 0) {
            result = "RA";
        } else if (number % 3 == 0) {
            result = "FIN";
        } else {
            result = "" + number;
        }

        System.out.println("result = " + result);

    }
}
