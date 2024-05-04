package ema.week06_solutions;

import java.lang.reflect.Array;

public class Array_FindMaximum {
     /*
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {

        int[] numbers = {10, 330, 20, 50, 45};
        int max = numbers[0];

        if(numbers == null || numbers.length == 0){
            System.out.println("Array is empty");
        }

        for (int each : numbers) {
            if(each > max){
                max = each;
            }
        }

        System.out.println("Maximum number in the array is: " + max + "!");
    }

}
