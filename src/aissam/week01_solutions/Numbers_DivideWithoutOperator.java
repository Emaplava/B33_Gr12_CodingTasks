package aissam.week01_solutions;

public class Numbers_DivideWithoutOperator {

     /*
    Write a method that can divide two numbers without using division operator
     */
     public static void main(String[] args) {
         int num1 = 100;
         int num2 = 50;

         int count = 0;

         while (num1>=num2){
             num1 = num1-num2;
             count++;
         }
         System.out.println(count);

     }
}
