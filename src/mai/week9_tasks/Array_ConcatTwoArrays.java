package mai.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_ConcatTwoArrays {

    /*
    Write a return method that can concat two arrays
     */
    public static void main(String[] args) {
        int[] numberArrays1 = {1, 2, 3, 4, 5};
        int[] numberArrays2 = {6, 7, 8, 9, 10};

        ArrayList<Integer> concatArrays = new ArrayList<>();

        for (int i : numberArrays1) {
            concatArrays.add(i);
        }
        for (int i : numberArrays2) {
            concatArrays.add(i);
        }

        System.out.println("Number arrays 1 = " + Arrays.toString(numberArrays1));
        System.out.println("Number arrays 2 = " + Arrays.toString(numberArrays2));
        System.out.println("Concat two arrays = " + concatArrays);


        System.out.println("--------------------------------------------------");

        String[] nameArrays1 = {"Alice", "Bob", "Clair"};
        String[] nameArrays2 = {"David", "Erica", "Frank"};

        ArrayList<String> concatNameArrays = new ArrayList<>();

        concatNameArrays.addAll(Arrays.asList(nameArrays1));
        concatNameArrays.addAll(Arrays.asList(nameArrays2));

        System.out.println("Name arrays 1 = " + Arrays.toString(nameArrays1));
        System.out.println("Name arrays 2 = " + Arrays.toString(nameArrays2));
        System.out.println("Concat two arrays = " + concatNameArrays);
    }
}
