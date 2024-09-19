import java.util.Arrays;

public class seive {
    public static void main(String[] args) {
        int n = 30;
        int[] a = new int[n + 1]; // Create an array of size n+1 for 0 to n

        Arrays.fill(a, 1); // Fill the array with 1s

        // 0 and 1 are not prime numbers
        a[0] = a[1] = 0;

        for (int i = 2; i <= n; i++) {
            if (a[i] == 1) { // i is a prime number
                System.out.print(i + " "); // Print the prime number
                // Mark multiples of i as not prime
                for (int t = i * i; t <= n; t += i) {
                    a[t] = 0;
                }
            }
        }
    }
}
