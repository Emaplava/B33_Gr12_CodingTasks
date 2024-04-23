package ema.week05_solutions;

public class String_UniqueCharacters {

    /*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";

     */


    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String uniqueCharacters = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                uniqueCharacters += ch;
            }
        }

        System.out.println("Given String      : " + str);
        System.out.println("Unique Character  : " + uniqueCharacters);

    }




}
