package yazid.week4_tasks;

import java.util.*;
 /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */

public class String_RemoveDup {
    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the current character is not already present in the result
            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        String result = removeDup(input);
        System.out.println(result); // Output: ABC
    }
}



