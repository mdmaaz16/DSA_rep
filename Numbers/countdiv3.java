
import java.util.Arrays;

class countdiv3 {
    static int count3DivNums(Long L, Long R) {
        // Step 1: Find the limit for primes
        long limit = (long) Math.sqrt(R) + 1; // We need to find primes up to sqrt(R)

        // Step 2: Sieve of Eratosthenes to find all primes up to 'limit'
        boolean[] isPrime = new boolean[(int) limit];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not primes

        for (long i = 2; i * i < limit; i++) {
            if (isPrime[(int) i]) {
                for (long j = i * i; j < limit; j += i) {
                    isPrime[(int) j] = false;
                }
            }
        }

        // Step 3: Count numbers between L and R with exactly three divisors
        int count = 0;

        for (long i = 2; i < limit; i++) {
            if (isPrime[(int) i]) {
                long square = i * i;
                if (square >= L && square <= R) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Test the function with some inputs
        System.out.println(count3DivNums(1L, 100L)); // Example test case
    }
}