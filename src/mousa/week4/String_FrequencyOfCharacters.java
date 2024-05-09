package mousa.week4;

import java.util.HashMap;
import java.util.Map;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */

    public class CharacterFrequency {
        public static String frequencyOfChars(String str) {
            // Create a HashMap to store characters and their frequencies
            Map<Character, Integer> charFreq = new HashMap<>();

            // Iterate through each character in the string
            for (char ch : str.toCharArray()) {
                // Increment the frequency count for the character or add it to the map if not present
                charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
            }

            // Create a StringBuilder to construct the result string
            StringBuilder result = new StringBuilder();

            // Iterate through the map entries and append character-frequency pairs to the result string
            for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
                result.append(entry.getKey()).append(entry.getValue());
            }

            // Convert the StringBuilder to a string and return
            return result.toString();
        }

        public static void main(String[] args) {
            String input = "AAABBCDD";
            System.out.println("Frequency of characters in \"" + input + "\": " + frequencyOfChars(input)); // Output: Frequency of characters in "AAABBCDD": A3B2C1D2
        }



    }




}
