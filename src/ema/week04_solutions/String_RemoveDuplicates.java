package ema.week04_solutions;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static void main(String[] args) {

         String list1 = "AAABBBCCC";
        String list2 = "";

        for (int i = 0; i < list1.length(); i++) {

            char ch = list1.charAt(i);

            if (list2.contains("" + ch)) {
                continue;
            }

            list2 += ch;
        }

        System.out.println(list2);
    }
}
