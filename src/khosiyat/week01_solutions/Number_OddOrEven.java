package week01_solutions;

public class Number_OddOrEven {

    public static String identify(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(identify(10)); // Output: Even
        System.out.println(identify(17)); // Output: Odd
        System.out.println(identify(0));  // Output: Even (special case for zero)
    }
}


/*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"
 */