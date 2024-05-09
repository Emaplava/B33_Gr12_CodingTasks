package ema.week04_solutions;

public class String_FrequencyOfCharacters {

    /*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
    public static void main(String[] args) {
        String str = "aaabbbcccdddEEEFFF";

        String result = "";


        //get the char one by one
        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i); //first iteration is a
            //count the char
            int numberOfEach = count(eachCharacter, str); /// I have 2 a
            //put in the container
            if (!result.contains(numberOfEach + ""))
                result += "" + eachCharacter + numberOfEach;
        }
        //     return result;
        System.out.println(result);

    }

    private static int count(char searched, String word) {
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            //    char eachCharacter = word.charAt(i);
            if (word.charAt(i)== searched)
                counter++;

        }

        return counter;

    }


}
