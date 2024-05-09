package mousa.week5;

public class String_Reverse {

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
        ---
        ----
     */

    public static String reverse(String str) {
        // Create a StringBuilder and append each character of the string in reverse order
        StringBuilder reversedStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr.append(str.charAt(i));
        }
        // Convert the StringBuilder to a string and return
        return reversedStr.toString();
    }

    public static void main(String[] args) {
        String input = "ABCD";
        System.out.println("After reversing \"" + input + "\": " + reverse(input)); // Output: After reversing "ABCD": DCBA
    }


}
