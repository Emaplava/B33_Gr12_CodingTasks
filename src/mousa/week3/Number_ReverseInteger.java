package mousa.week3;

public class Number_ReverseInteger {

/*
Write a return method that can reverse
negative number and return it as int
 */
public static int reverseNegative(int num) {
    // Check if the number is negative
    if (num < 0) {
        // Convert the negative number to a string to facilitate reversal
        String numStr = Integer.toString(num);
        // Reverse the string excluding the negative sign
        StringBuilder reversedStr = new StringBuilder(numStr.substring(1)).reverse();
        // Append the negative sign to the reversed string and parse it as an integer
        int reversedNum = Integer.parseInt("-" + reversedStr.toString());
        return reversedNum;
    } else {
        return num; // Return the number unchanged if it's not negative
    }
}

    public static void main(String[] args) {
        int negativeNum1 = -123;
        int negativeNum2 = -4567;
        int positiveNum = 789;

        System.out.println("Reversed negative number " + negativeNum1 + ": " + reverseNegative(negativeNum1)); // Output: Reversed negative number -123: -321
        System.out.println("Reversed negative number " + negativeNum2 + ": " + reverseNegative(negativeNum2)); // Output: Reversed negative number -4567: -7654
        System.out.println("Reversed positive number " + positiveNum + ": " + reverseNegative(positiveNum)); // Output: Reversed positive number 789: 789

}
}
