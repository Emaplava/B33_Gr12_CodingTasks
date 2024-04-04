package aissam.week02_solutions;

public class Number_ConsecutiveNumbers {
    public static void Number_ConsecutiveNumbers(int N){
        for (int i = 0; i <= N; i++) {

            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println ("Codility " + "test" + " coders" +"\t" + i);
            }else if (i % 2 == 0 && i % 3 == 0 ) {
                System.out.println ("Codility " + "test");
            }else if (i % 2 == 0 && i % 5==0) {
                System.out.println ("Codility " + "coders"+ "\t"  + i);
            } else if (i % 3 == 0 && i %5==0) {
                System.out.println ("test" + " coders" +"\t"  + i);
            }else if ( i % 2 == 0){
                System.out.println ("Codility "+"\t" + i);
            } else if ( i % 3 == 0) {
                System.out.println ("test"+"\t" + i );
            } else if ( i % 5 == 0) {
                System.out.println ("coders"+"\t" + i);
            }else {
                System.out.println (i );
            }

        }

    }

    public static void main(String[] args) {
        Number_ConsecutiveNumbers(30);

    }




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





    }



