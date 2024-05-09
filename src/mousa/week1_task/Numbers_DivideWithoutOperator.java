package mousa.week1_task;

public class Numbers_DivideWithoutOperator {

     /*
    Write a method that can divide two numbers without using division operator
     */
     public static int divide(int dividend, int divisor) {
         // Check if the divisor is 0
         if (divisor == 0) {
             throw new ArithmeticException("Cannot divide by zero");
         }

         // If the dividend is 0, the result is 0
         if (dividend == 0) {
             return 0;
         }

         // Handle overflow cases
         if (dividend == Integer.MIN_VALUE && divisor == -1) {
             return Integer.MAX_VALUE;
         }

         // Determine the sign of the result
         int sign = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

         // Take the absolute values of dividend and divisor
         long absDividend = Math.abs((long) dividend);
         long absDivisor = Math.abs((long) divisor);

         // Initialize the quotient
         long quotient = 0;

         // Subtract divisor from dividend until dividend becomes less than divisor
         while (absDividend >= absDivisor) {
             absDividend -= absDivisor;
             quotient++;
         }

         // Apply the sign to the quotient
         int result = sign * (int) quotient;

         return result;
     }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;
        int quotient = divide(dividend, divisor);
        System.out.println("Quotient: " + quotient); // Output: Quotient: 3
    }
}
