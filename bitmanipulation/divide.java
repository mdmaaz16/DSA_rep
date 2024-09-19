package bitmanipulation;

                                
public class divide {

    public static int divide1(int dividend, int divisor) {
        // Check if dividend and divisor
        // are equal, return 1 if true
        if (dividend == divisor) {
            return 1;
        }

        // Determine the sign of the result,
        // true for positive, false for negative
        boolean sign = true;

        // If dividend is positive and
        // divisor is negative, set sign to negative
        if (dividend >= 0 && divisor < 0) {
            sign = false;
        }
        // If dividend is negative and divisor
        // is positive, set sign to negative
        else if (dividend <= 0 && divisor > 0) {
            sign = false;
        }

        // Take absolute values
        // of dividend and divisor
        long n = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        // Store original divisor absolute
        // value in divisor variable
        divisor = Math.abs(divisor);

        // Initialize quotient to 0
        long quotient = 0;

        // Perform division using
        // repeated subtraction
        while (n >= d) {
            // Count how many times divisor can
            // be doubled before exceeding dividend
            int cnt = 0;
            while (n >= (d << (cnt + 1))) {
                cnt += 1;
            }
            // Add the value corresponding
            // to the current doubling to the quotient
            quotient += 1 << cnt;
            // Subtract the product of divisor
            // and the doubled value from dividend
            n -= (d << cnt);
        }

        // Handle overflow cases
        // If quotient equals (2^31) and the result
        // is supposed to be positive, return Integer.MAX_VALUE
        if (quotient == (1L << 31) && sign) {
            return Integer.MAX_VALUE;
        }
        // If quotient equals (2^31) and the result
        // is supposed to be negative, return Integer.MIN_VALUE
        if (quotient == (1L << 31) && !sign) {
            return Integer.MIN_VALUE;
        }
        // Return the quotient with correct sign
        return sign ? (int) quotient : (int) -quotient;
    }

    public static void main(String[] args) {
        int dividend = 45;
        int divisor = 7;
        System.out.println("Dividend: " + dividend + " Divisor: " + divisor);
        int result = divide1(dividend, divisor);
        System.out.println("Result of division: " + result);
    }
}
                                
                            