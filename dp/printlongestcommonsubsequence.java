package dp;
import java.util.*;

public class printlongestcommonsubsequence {
    public static void main(String[] args) {
        String s1 = "abaaa";
        String s2 = "baabaca";
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n + 1][m + 1];

        // Fill the dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= m; j++) {
            dp[0][j] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Array to store the LCS characters
        char[] c = new char[dp[n][m]];
        int index = dp[n][m] - 1; // Start from the last character
        int i = n, j = m;

        // Trace back to find the LCS
        while (i > 0 && j > 0) {
            if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                c[index--] = s1.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Print the LCS
        System.out.println(new String(c)); // Corrected to create a string from char array
    }
}
