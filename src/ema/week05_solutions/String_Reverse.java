package ema.week05_solutions;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        
        String str = "ABCD";
        String reverseString = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverseString += str.charAt(i);
            
        }
        System.out.println("Given string   :  " + str);
        System.out.println("Reverse string :  " + reverseString);
        
    }



}
