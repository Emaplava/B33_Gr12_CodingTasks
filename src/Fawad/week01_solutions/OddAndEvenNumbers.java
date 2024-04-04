package Fawad.week01_solutions;

public class OddAndEvenNumbers {
 /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */

    public static void main(String[] args) {
        int number1 = 35;
        int number2 = 20;

        System.out.println("Number1 is: " + findOddAndEvenNumbers(number1));
        System.out.println("Number2 is: " + findOddAndEvenNumbers(number2));
    }

    public static String findOddAndEvenNumbers(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

}

