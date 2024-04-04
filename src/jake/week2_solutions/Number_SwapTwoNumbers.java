package jake.week2_solutions;

public class Number_SwapTwoNumbers {

    public static void main(String[] args) {

        int x = 42;
        int y = 13;

        // x(15) + y(25) = 40, make that x(40)
        // x(40) - y(25) = 15, make that y(15)
        // x(40) - y(15) = 25, make that x(25)

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

}
/*
    Swap two variable values without using a third variable
     */