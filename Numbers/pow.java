
class pow {
    static double myPow(double x, int n) {
        long nn = n; // Use long to handle potential overflow for negative values
        if (nn < 0) {
            nn = -nn;
            x = 1 / x; // Invert x for negative exponents
        }

        double ans = 1; // Initialize ans to 1 for multiplication identity
        while (nn > 0) {
            if (nn % 2 == 1) { // If nn is odd
                ans *= x;
                // System.out.println(ans);
            }
            x *= x; // Square the base
            // System.out.println(x);
            nn /= 2; // Divide nn by 2
            System.out.println(nn);
        }

        return ans;
    }
    public static void main(String[] args) {
        double x = 2;
        int n = 5;
        System.out.println(myPow(x,n));
    }
}
