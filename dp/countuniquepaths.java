package dp;
//memo
// class Solution
// {
//     static int find(int dp[][],int a,int b){
//         if(a==0 && b==0){
//             return 1;
//         }
//         if(a<0 || b<0){
//             return 0;
//         }
//         if(dp[a][b]!=-1){
//             return dp[a][b];
//         }
//         int up=find(dp,a-1,b);
//         int left=find(dp,a,b-1);
//         return dp[a][b]=up+left;
//     }
//     //Function to find total number of unique paths.
//     public static int NumberOfPath(int a, int b) 
//     {
//         //Your code here
//         int dp[][] = new int[a][b];
//         for(int i=0;i<a;i++){
//             for(int j=0;j<b;j++){
//                 dp[i][j]=-1;
//             }
//         }
//         dp[0][0]=0;
//         return find(dp,a-1,b-1);
//     }
// }

//tabulation
class countuniquepaths {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else{
                    int up=0,left=0;
                    if(i>0){
                        up=dp[i-1][j];
                    }
                    if(j>0){
                        left = dp[i][j-1];
                    }
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}