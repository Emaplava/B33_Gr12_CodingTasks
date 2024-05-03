package ema.week06_solutions;

public class String_SumOfAllIntegers {
    /*
    return the sum of all integers found in the parameter String

            Please implement this method to return the sum of all integers found in the
            parameter String. You can assume that integers are separated from other
            parts with one or more spaces (' ' symbol).

            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */

    public static void main(String[] args) {
        String str = "12 some text 13 8 ";
        int result = sumOfIntegers(str);
        System.out.println("Sum of all integers is: " + result);
    }
    public static int sumOfIntegers(String str) {
        String[] parts = str.split("\\s+");
        int sum = 0;

        for (String part : parts) {
            try {
                int num = Integer.parseInt(part);
                sum += num;
            } catch (NumberFormatException e) {

            }
        }
        return sum;
    }

}