package dp;

// package dynamic programming;

//package dynamic programming;

//memoization approach
// static int countWays(int n, int dp[])
// {
//     if (n <= 1)
//         return dp[n] = 1;

//     if (dp[n] != -1) {
//         return dp[n];
//     }
//     dp[n] = countWays(n - 1, dp) + countWays(n - 2, dp);
//     return dp[n];
// }
//optkmiezed
// static int countWays(int n)
//     {
//         // declaring  two variables to store the count
//         int prev = 1;
//         int prev2 = 1;
//         // Running for loop to count all possible ways
//         for (int i = 2; i <= n; i++) {
//             int curr = prev + prev2;
//             prev2 = prev;
//             prev = curr;
//         }
//         return prev;
//     }

class climbstairs {
    public int climbStairs(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 1;
        }
        
        int a = 1;  // f(0)
        int b = 1;  // f(1)
        
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;  // f(n) = f(n-1) + f(n-2)
            a = temp;
        }
        
        return b;
    }
}

