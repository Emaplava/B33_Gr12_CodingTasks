package mousa.week3;

public class Number_Prime {

    /*
        Write a method that can check if a number is prime or not
     */
    public static boolean isPrime(int number) {
        // Handle cases for numbers less than 2
        if (number <= 1) {
            return false;
        }

        // Check for divisibility by numbers from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by i, hence not prime
            }
        }

        return true; // Number is prime
    }

    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 20;

        System.out.println(num1 + " is prime: " + isPrime(num1)); // Output: 17 is prime: true
        System.out.println(num2 + " is prime: " + isPrime(num2)); // Output: 20 is prime: false
    }



}
