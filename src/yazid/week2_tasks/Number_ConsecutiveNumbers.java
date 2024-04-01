package yazid.week2_tasks;
 /*
    Write a function:
    that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
    However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
    If a number is divisible by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
    For example, numbers divisible by both 2 and 3 should be replacée by CodilityTest and numbers divisible by all
    three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.

        For example, here is the output for N = 24:
                                    1
                                    Codility        2
                                    Test            3
                                    Codility        4
                                    Coders          5
                                    CodilityTest    6
                                    7
                                    Codility        8
                                    Test            9
                                    Codi1ityCoders  10
                                    11
                                    CodilityTest    12
                                    13
                                    Codility        14
                                    TestCoders      15
                                    Codility        16
                                    17
                                    ....
     */

public class Number_ConsecutiveNumbers {


    public static void printConsecutiveNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            String result = "";

            if (i % 2 == 0)
                result += "Codility";
            if (i % 3 == 0)
                result += "Test";
            if (i % 5 == 0)
                result += "Coders";

            if (result.isEmpty())
                System.out.println(i);
            else
                System.out.println(result);
        }
    }

    public static void main(String[] args) {
        printConsecutiveNumbers(24);
    }
}