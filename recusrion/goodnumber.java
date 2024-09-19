
class goodnumber {
    long mod = 1_000_000_007;
    private long pow(long num, long n){
        if(n==0){
            return 1;
        }
        long temp = pow(num,n/2);
        if(n%2==0){
            return (temp*temp)%mod;
        }
        else{
            return (num*temp*temp)%mod;
        }
    }
    public int countGoodNumbers(long n) {
        long even = (n+1)/2;
        long odd = n/2;
        long e = pow(5,even)%mod;
        long o = pow(4,odd)%mod;
        int res = (int)((e*o)%mod);
        return res;
    }

}