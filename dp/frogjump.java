package dp;
import java.util.*;

//memoization technique
/*public class frogjump {
    static int find(int n,int a[],int dp[]){
        if(n==0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int left = find(n-1,a,dp)+Math.abs(a[n]-a[n-1]);
        int right=Integer.MAX_VALUE;
        if(n>1){
            right = find(n-2,a,dp)+Math.abs(a[n]-a[n-2]);
        }
        return dp[n]=Math.min(left,right);
    }
    public static void main(String[] args) {
        int n=3;
        int a[] = {10,20,30,10};
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(find(n,a,dp));
    }
}*/

//Tabulation Technique

class frogjump{
    public static void main(String[] args) {
        int a[] = {10,20,30,10};
        int dp[] = new int[a.length];
        Arrays.fill(dp,0);
        dp[0]=0;
        for(int i=1;i<a.length;i++){
            int left = dp[i-1]+Math.abs(a[i]-a[i-1]);
            int right = Integer.MAX_VALUE;
            if(i>1){
                right = dp[i-2]+Math.abs(a[i]-a[i-2]);
            }
            dp[i] = Math.min(left,right);
        }
        System.out.println(dp[a.length-1]);
    }
}
