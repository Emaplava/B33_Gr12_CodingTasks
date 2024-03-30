package ema.week01_solutions;

public class Numbers_DivideWithoutOperator {

    public static void main(String[] args) {

        divideTwoNumbers(22,5);

    }

    public static void divideTwoNumbers(int num1,int num2){

   //     int num1 = 21;
  //      int num2 = 5; // result 4 remains 1

        int count = 0;

        if (num2 <= 0 ){
            System.err.println("THE NUMBER CAN NOT BE ZERO OR NEGATIVE");

        }
        //        1      5
        while (num1 >=num2) {//false and exit the loop
            num1 = num1 - num2;//21-5=16, 16-5=11, 11-5=6, 6-5=1
            //16
            count++;//1 2 3 4
        }
        System.out.println("The result is "  + count + " the remainder is "+ num1);

    }

     /*
    Write a method that can divide two numbers without using division operator
     */
}
