package mai.week1_tasks;

public class Numbers_DivideWithoutOperator {

/*
   Write a method that can divide two numbers without using division operator
*/


    public static int division(int num1, int num2) {
        int result = (num1 / num2);
        return result;
    }
    public static double division(double num1, double num2) {
        double result = (num1 / num2);
        return result;
    }

    public static void main(String[] args) {
    int num1 = 10, num2 = 5;
        System.out.println(division(num1, num2));
        System.out.println(division(100, 2));

    }
}

