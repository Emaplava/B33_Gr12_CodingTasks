package mai.week3_tasks;
    /*
        Write a method that can check if a number is prime or not
     */

public class Number_Prime {

    public static void main(String[] args) {
        int num = 29;
        boolean isPrime = isPrime(num);

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
