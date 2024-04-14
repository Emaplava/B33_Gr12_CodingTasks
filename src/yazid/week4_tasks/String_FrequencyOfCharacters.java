package yazid.week4_tasks;

import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {
    public static String frequencyOfChars(String str) {
        // Create a map to store character frequencies HashMap does not allow duplicates
        Map<Character, Integer> charFreq = new HashMap<>();

        // Iterate through the characters of the string and update their frequencies
        for (char i : str.toCharArray()) {
            charFreq.put(i, charFreq.getOrDefault(i, 0) + 1);
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aaabbbcccdddEEEFFF";
        String result = frequencyOfChars(input);
        System.out.println(result); // Output: A3B2C1D2

    }
}