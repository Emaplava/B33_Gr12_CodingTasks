package mousa.week5;

import java.util.LinkedHashSet;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
            ----
            ----

     */

    public static String unique(String str) {
        // Create a LinkedHashSet to store unique characters while preserving the order
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        // Add each character from the string to the LinkedHashSet
        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }

        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Append each unique character from the LinkedHashSet to the result string
        for (char ch : uniqueChars) {
            result.append(ch);
        }

        // Convert the StringBuilder to a string and return
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "AAABBBCCCDEF";
        System.out.println("Unique characters in \"" + input + "\": " + unique(input)); // Output: Unique characters in "AAABBBCCCDEF": DEF
    }


}
