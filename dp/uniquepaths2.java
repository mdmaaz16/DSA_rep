package dp;
//if dead cell we should not visit

class uniquepaths2 {
    static int find(int obstacleGrid[][],int dp[][],int r,int c){
        if(r>=0 && c>=0 && obstacleGrid[r][c]==1){
            return 0;
        }
        if(r==0 && c==0){
            return 1;
        }
        if(r<0 || c<0){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        int up=find(obstacleGrid,dp,r-1,c);
        int left=find(obstacleGrid,dp,r,c-1);
        return dp[r][c]=up+left;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return find(obstacleGrid,dp,m-1,n-1);
    }
}

// class Solution {
//     public int totalWays(int N, int M, int grid[][]) {
//         // Code here
        
//         int mod = 1000000007;
//         int dp[][]=new int[N][M];
//         for(int i=0;i<N;i++){
//             for(int j=0;j<M;j++){
//                 if(grid[i][j]==1){
//                     dp[i][j]=0;
//                 }
//                 else if(i==0 && j==0){
//                     dp[i][j]=1;
//                 }
//                 else{
//                     int up=0,left=0;
//                 if(i>0)
//                 up=dp[i-1][j];
//                 if(j>0)
//                 left=dp[i][j-1];
//                  dp[i][j] = (up + left) % mod;
//                 }
                
//             }
//         }
//         return dp[N-1][M-1];
//     }
// }