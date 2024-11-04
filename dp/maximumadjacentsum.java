package dp;

import java.util.Arrays;

// //memo
// class Solution {
//     static int find(int a[],int n,int dp[]){
//         if(n==0){
//             return a[n];
//         }
//         if(n<0){
//             return 0;
//         }
//         if(dp[n]!=-1){
//             return dp[n];
//         }
//         int x = a[n]+find(a,n-2,dp);
//         int y = find(a,n-1,dp);
//         return dp[n] = Math.max(x,y);
//      }
//     public int rob(int[] nums) {
//         int dp[] = new int[nums.length];
//         Arrays.fill(dp,-1);
//         return find(nums,nums.length-1,dp);
//     }
// }
//tabulation
// public class maximumadjacentsum {
//     public static void main(String[] args) {
//         int a[] = {1,2,3,1};
//         int dp[] = new int[a.length];
//         dp[0] = a[0];
//         for(int i=1;i<a.length;i++){
//             // if(i<)
//             int take = a[i];
//             if(i>1){
//                 take+=dp[i-2];
//             }
//             int nontake = dp[i-1];
//             dp[i] = Math.max(take,nontake);
//         }
//         System.out.println(dp[a.length-1]);
//     }
// }


//space optimzation
class maximumadjacentsum{
    public static void main(String[] ar){
        int a[] = {1,2,3,1};
        int prev = a[0];
        int prev2=0;
        for(int i=1;i<a.length;i++){
            int take=a[i];
            if(i>1){
                take+=prev2;
            }
            int nontake = prev;
            int curi = Math.max(take,nontake);
            prev2=prev;
            prev=curi;
        }
        System.out.println(prev);
    }
}
