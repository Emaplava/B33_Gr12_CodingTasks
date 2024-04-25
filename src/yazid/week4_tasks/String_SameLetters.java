package yazid.week4_tasks;

import java.util.Arrays;

public class String_SameLetters {
    public static boolean same(String str1, String str2) {
        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";

        if (same(str1, str2)) {
            System.out.println("True.");
        } else {
            System.out.println("False.");
        }
    }
}

