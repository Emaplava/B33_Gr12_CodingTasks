package Fawad.week08_solutions;

public class Array_SumUpToZero {

    /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */

    public static void main(String[] args) {

        int num1 = 7; //
        int num2 = num1 / 2;
        for (int i = 1; i <= num2; i++) {
            System.out.print(i + " ");
            System.out.print(-i + " ");
        }
        if (num1 % 2 != 0) { // This condition checks if num1 is an odd number. If it is, the next line will be executed.
            System.out.println(0); //
        }
    }
}
