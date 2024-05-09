package mousa.week4;

import java.util.LinkedHashSet;

public class String_RemoveDuplicates {
    /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */
    public static String removeDup(String str) {
        // Convert the string to a LinkedHashSet to remove duplicates while preserving the order
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();

        // Add each character from the string to the LinkedHashSet
        for (char ch : str.toCharArray()) {
            charSet.add(ch);
        }

        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Append each character from the LinkedHashSet to the result string
        for (char ch : charSet) {
            result.append(ch);
        }

        // Convert the StringBuilder to a string and return
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCC";
        System.out.println("After removing duplicates from \"" + input + "\": " + removeDup(input)); // Output: After removing duplicates from "AAABBBCCC": ABC
    }



}
