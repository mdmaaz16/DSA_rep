class Solution {
    static int find(String t1,String t2,int m,int n,int dp[][]){
        if(m<0 || n<0){
            return 0;
        }
        if(t1.charAt(m)==t2.charAt(n)){
            return dp[m][n]=1+find(t1,t2,m-1,n-1,dp);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        return dp[m][n]=Math.max(find(t1,t2,m-1,n,dp),find(t1,t2,m,n-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for(int a[]:dp){
            Arrays.fill(a,-1);
        }
        return find(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
}