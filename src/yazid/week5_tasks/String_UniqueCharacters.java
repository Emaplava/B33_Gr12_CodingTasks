package yazid.week5_tasks;

public class String_UniqueCharacters {

    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) == str.lastIndexOf(currentChar)) {
                uniqueChars += currentChar;
            }
        }

        System.out.println("Input: " + str);
        System.out.println("Unique characters: " + uniqueChars);
    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


    }
}