package Fawad.week04_solutions;

import java.util.HashMap;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";
        //We declare and initialize a String to find the frequencies ot its characters

        //Then we create a HashMap to store each character of the string as a key and its frequency as the value
        HashMap<Character, Integer> charFrequency = new HashMap<>();

        //We loop through each character of the string
        for (char result : str.toCharArray()) {

            //Here we define a condition and checking if character is already in the HashMap.
            if (charFrequency.containsKey(result)) {
                charFrequency.put(result, charFrequency.get(result) + 1); // If yes, increment its frequency, if not, add it with frequency 1
            } else {
                charFrequency.put(result, 1); //Shows that it has been encountered once
            }
        }
        //And we print the character frequencies
        System.out.println("Characters frequencies: " + charFrequency);
    }

}
