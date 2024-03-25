package yazid.week1_tasks;

public class numbers_OddOrEven {
    public class NumberIdentifier {
        public static String identify(int number) {
            if (number % 2 == 0) {
                return "Even";
            } else {
                return "Odd";
            }
        }

        public static void main(String[] args) {
            // Test cases
            System.out.println(identify(5));
            System.out.println(identify(6));
        }
    }
}
/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */