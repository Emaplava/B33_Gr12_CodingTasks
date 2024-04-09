package Fawad.week03_solutions;

public class Number_Prime {
    public static void main(String[] args) {

      int num = 50;
        System.out.println(num);

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= num; j++) {
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

