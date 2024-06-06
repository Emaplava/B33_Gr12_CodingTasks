package mai.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        ArrayList<Integer> numberArray = new ArrayList<>();

        numberArray.addAll(Arrays.asList(1, 2, 3, 99, 100, 101, 200, 303));

        System.out.println("List of integers " + numberArray);

        numberArray.removeIf(num -> num > 100);

        System.out.println("Remove value greater than 100 " + numberArray);
    }
}











