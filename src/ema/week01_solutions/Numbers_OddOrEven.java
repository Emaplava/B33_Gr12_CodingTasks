package ema.week01_solutions;

public class Numbers_OddOrEven {

    public static void main(String[] args) {

        oddOrEvenNumbers(23);
    }

    public static void oddOrEvenNumbers(int number){

//        int number = -20;

        if (number == 0){
            System.err.println("THE NUMBER CAN NOT BE NULL OR NEGATIVE!");
        }else if (number % 2 == 0){
            System.out.println(number + " -> this number is even.");
        }else {
            System.out.println(number + " -> this number is odd.");
        }
    }

    /*
    Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"

     */
}
