package mai.week9_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class List_RemoveNameAhmed {

    /*
    Given a list of people names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */

    public static void main(String[] args) {

        ArrayList<String> peopleArrays = new ArrayList<>();

        peopleArrays.addAll(Arrays.asList("Ahmed","John", "Eric", "Henry", "Ahmed"));

        System.out.println("List of people name \n" + peopleArrays);

        peopleArrays.removeIf(name -> name.equals("Ahmed"));

        System.out.println("Remove all the names named \"Ahmed\" \n" + peopleArrays);

    }

}
