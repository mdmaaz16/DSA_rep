package dp;

class geekpoints {
    static int find(int a[][],int n,int last,int dp[][]){
        if(n==0){
            int max=0;
            for(int i=0;i<3;i++){
                if(i!=last)
                max=Math.max(max,a[0][i]);
            }
            return max;
        }
        if(dp[n][last]!=-1){
            return dp[n][last];
        }
        int max=0;
        for(int i=0;i<3;i++){
            if(i!=last){
                int points=a[n][i]+find(a,n-1,i,dp);
                max=Math.max(points,max);
            }
        }
        return dp[n][last]=max;
    }
    public int maximumPoints(int arr[][], int N) {
        // code here
        // if (N == 0 || arr.length == 0) {
        //     return 0;
        // }
        // int dp[][] = new int[N][4];
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<4;j++){
        //         dp[i][j]=-1;
        //     }
        // }
        // return find(arr,N-1,3,dp);
        int[][] dp = new int[N][3];

        // Initialize the first day
        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        // Fill the dp array for the remaining days
        for (int i = 1; i < N; i++) {
            dp[i][0] = Math.max(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.max(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }

        // The maximum points will be the maximum of the three options on the last day
        return Math.max(dp[N-1][0], Math.max(dp[N-1][1], dp[N-1][2]));
    }
}