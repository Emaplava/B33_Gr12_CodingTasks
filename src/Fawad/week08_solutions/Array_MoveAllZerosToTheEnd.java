package Fawad.week08_solutions;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {
        int[] arr = {1, 0, 3, 6, 0, 7, 0, 5, 4}; // assume this our array

        int counter = 0; // the counter variable will be used to keep track of the index of the new array after moving the
                             // non-zero elements to the beginning.
        for (int i = 0; i < arr.length; i++) { // the loop will start its iteration from the beginning of the array

            if (arr[i] != 0) { //  if the element is not zero, then it is assigned to the index counter in the arr array.
                // after that, the counter variable is incremented.
               arr[counter] = arr[i]; // increment counter
                 counter++; //
                }
            }

        // need a while loop here to move the zeros to the new array
            while (counter < arr.length) { // The while loop will continue until the counter is equal
                // to the length of the arr array.
                arr[counter] = 0; // Inside the while loop, the value 0 is assigned to the index counter in the arr array.
                counter++; // here the counter variable will be incremented by 1 after each iteration of the while loop.
            }

            System.out.println(Arrays.toString(arr)); // printing our array
        }
    }










































// moving zeros to the beginning of the array

//int [] arr = {1, 0, 3, 6, 0, 7, 0, 5, 4}; // initiating our array
//        if (arr.length == 0) { // if the length of our array is zero
//        System.out.println("Array is empty!"); // print, array is empty
//        }
//int [] newArray = new int[arr.length]; // our new array
//int counter = arr.length -1; // increment counter for each element in our array
//        for (int num : arr) {
//        if(num != 0){
//newArray[counter] = num;
//counter--;
//        }}
//        System.out.println(Arrays.toString(newArray));
//
//        }

