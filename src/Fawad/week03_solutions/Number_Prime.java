package Fawad.week03_solutions;

public class Number_Prime {
    public static void main(String[] args) {

      int num = 50; // nums assigned value is 50 and
        System.out.println(num); // print num

        for (int i = 2; i <= num; i++) { // we iterate through numbers from 2 because 2 is not a prime number
            boolean isPrime = true; // this line initialize a boolean variable
            for (int j = 2; j <= num; j++) { // This nested loop checks if the number i is dividable or not
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.print(i + " ");
            }
        }
    }

    }

    /*
        Write a method that can check if a number is prime or not
     */

