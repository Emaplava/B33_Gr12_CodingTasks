package mousa.week1_task;

public class Numbers_OddOrEven {

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
    public static String identify(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;

        System.out.println("Number " + num1 + " is: " + identify(num1)); // Output: Number 5 is: Odd
        System.out.println("Number " + num2 + " is: " + identify(num2)); // Output: Number 6 is: Even
    }
}
