package mai.week7_tasks;

import java.util.Arrays;

public class Array_FindMinimum {

    /*
    Write a function that can find the minimum number from an int Array
     */

    public static void main(String[] args) {

        int[] numbers = {10, 5, 8, 3, 12, 7};

        int minNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }

        }
        System.out.println("minNumber = " + minNumber);
    }


}