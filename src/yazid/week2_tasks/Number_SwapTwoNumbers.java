package yazid.week2_tasks;

public class Number_SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b;// a=  15
        b = a - b;// 15- 10 = 5 now b =5
        a = a - b;// 15 - 5 = 10 now a = 10

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

 /*
    Swap two variable values without using a third variable

     */
//Arithmetic operations//