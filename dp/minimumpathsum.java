package dp;

public class minimumpathsum {
    public static void main(String[] args) {
        //int m = grid.length;
        //         int n = grid[0].length;
        //         int dp[][] = new int[m][n];
        //         dp[0][0]=grid[0][0];
        //         for (int j = 1; j < n; j++) {
        //     dp[0][j] = dp[0][j-1] + grid[0][j];
        // }
        
        // // Fill the first column (can only come from the top)
        // for (int i = 1; i < m; i++) {
        //     dp[i][0] = dp[i-1][0] + grid[i][0];
        // }
        //         for(int i=1;i<m;i++){
        //             for(int j=1;j<n;j++){
        //                 dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
        //             }
        //         }
        //         return dp[m-1][n-1];
    }
}

// class Solution {
//     static int find(int a[][], int dp[][], int r, int c) {
//         // Base case: top-left corner
//         if (r == 0 && c == 0) {
//             return a[r][c];
//         }

//         // If out of bounds, return a large value (acts as infinity)
//         if (r < 0 || c < 0) {
//             return Integer.MAX_VALUE;
//         }

//         // If already computed, return the memoized result
//         if (dp[r][c] != -1) {
//             return dp[r][c];
//         }

//         // Recursive case: find minimum path sum by coming either from the left or from the top
//         int fromTop = find(a, dp, r - 1, c);
//         int fromLeft = find(a, dp, r, c - 1);

//         // Memoize and return the result
//         return dp[r][c] = a[r][c] + Math.min(fromTop, fromLeft);
//     }
//     public int minPathSum(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int dp[][] = new int[m][n];
//         for(int i=0;i<m;i++){
//             for(int j=0;j<n;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         return find(grid,dp,m-1,n-1);
//     }
// }