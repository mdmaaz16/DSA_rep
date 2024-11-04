package dp;

class mininsertiontomakestringpalindrome {
    static int lcs(String s1,String s2,int dp[][]){
        for(int i=1;i<=s1.length();i++){
            for(int j=1;j<=s2.length();j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String s1=sb.toString();
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int i=0;i<s.length();i++){
            dp[i][0]=0;
        }
        for(int i=0;i<s.length();i++){
            dp[0][i]=0;
        }
        int n=lcs(s,s1,dp);
        int res=s.length()-n;
        return res;
    }
}