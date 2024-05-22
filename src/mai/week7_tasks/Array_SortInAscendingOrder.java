package mai.week7_tasks;

import java.util.Arrays;

public class Array_SortInAscendingOrder {

    /*
    Write a method that can sort an int array in Ascending order without using the sort method
     */
    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 3, 12, 7};

        System.out.println("Input Array:");
        System.out.println(Arrays.toString(arr));

        manualSort(arr);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(arr));

    }

    public static void manualSort(int[] numberArray) {
        int n = numberArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    // Swap numberArray[j] and numberArray[j + 1]
                    int swap = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = swap;

                }
            }
        }
    }
}