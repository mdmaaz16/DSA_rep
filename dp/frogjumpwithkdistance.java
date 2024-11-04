package dp;
import java.util.*;
//tabulation
// int dp[] = new int[arr.length];
//         Arrays.fill(dp,0);
//         for(int i=1;i<arr.length;i++){
//             int minsteps=Integer.MAX_VALUE;
//             for(int j=1;j<=k;j++){
//                 if(i-j>=0){
//                     int jump = dp[i-j]+Math.abs(arr[i]-arr[i-j]);
//                     minsteps = Math.min(minsteps,jump);
//                 }
//             }
//             dp[i]=minsteps;
//         }
//         return dp[arr.length-1];
//memiozation
public class frogjumpwithkdistance {
    static int find(int k,int a[],int n,int dp[]){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int maxLength=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(n-i>=0){
                int jump = find(k,a,n-i,dp)+Math.abs(a[n]-a[n-i]);
                maxLength = Math.min(maxLength,jump);
            }
        }
        dp[n]=maxLength;
        return find(k,a,n,dp);
    }
    public static void main(String[] args) {
        int k = 3, arr[]= {10, 30, 40, 50, 20};
        int dp[] = new int[arr.length];
        Arrays.fill(dp,-1);
        System.out.print(find(k,arr,arr.length-1,dp));
    }
    
}
