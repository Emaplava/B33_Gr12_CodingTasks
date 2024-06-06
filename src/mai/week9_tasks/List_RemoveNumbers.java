package mai.week9_tasks;

import java.util.ArrayList;

public class List_RemoveNumbers {

    /*
    Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
     */

    public static void main(String[] args) {

        ArrayList<Integer> numberArray = new ArrayList<>();

        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(3);
        numberArray.add(99);
        numberArray.add(100);
        numberArray.add(101);
        numberArray.add(200);
        numberArray.add(303);

        System.out.println("List of integers " + numberArray);

        numberArray.removeIf(num -> num > 100);

        System.out.println("Remove value greater than 100 " + numberArray);
    }
}











