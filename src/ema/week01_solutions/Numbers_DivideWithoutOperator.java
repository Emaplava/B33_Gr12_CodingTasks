package ema.week01_solutions;

public class Numbers_DivideWithoutOperator {

    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 2;

        int count = 0;

        while (num1>=num2){
            num1 = num1-num2;
            count++;
        }
        System.out.println(count);


    }
     /*
    Write a method that can divide two numbers without using division operator
     */
}
