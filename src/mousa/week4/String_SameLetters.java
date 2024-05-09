package mousa.week4;

import java.util.Arrays;

public class String_SameLetters {

    // Write a return method that check if a string is build out of the same letters as another string.
    // Ex:  same("abc",  "cab"); -> true

    public static boolean same(String str1, String str2) {
        // Convert both strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Convert sorted char arrays back to strings
        String sortedStr1 = new String(charArray1);
        String sortedStr2 = new String(charArray2);

        // Check if the sorted strings are equal
        return sortedStr1.equals(sortedStr2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" build out of the same letters? " + same(str1, str2)); // Output: Are "abc" and "cab" build out of the same letters? true
    }







}
