package yazid.week3_tasks;
/*
       Write a method that can check if a number is prime or not
    */
public class Number_Prime {
    public static boolean isPrime( int number){
        if (number<=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {
        int num =17;
        if (isPrime(num) ){
            System.out.println(num + " is a prime number");
        }else{
            System.out.println(num + " is not a prime number");
        }
    }
    }



