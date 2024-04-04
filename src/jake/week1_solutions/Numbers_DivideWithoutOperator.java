package jake.week1_solutions;

public class Numbers_DivideWithoutOperator {


    public static int divideWithoutOperator(int num1, int num2) {

        int count = 0;

        if(num1 >= num2){
            while(num1 >= num2){
                num1 = num1 - num2;
                count++;
            }
        }else{
            while(num2 >= num1){
                num2 = num2 - num1;
                count++;
            }
        }
        return count;
    }


     /*
    Write a method that can divide two numbers without using division operator
     */
}
