class primefactors{
    static boolean isprime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=36;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(isprime(i)){
                    System.out.println(i);
                }
                if(n/i!=i){
                    if(isprime((n/i))){
                        System.out.println(n/i);
                    }
                }
            }
        }
    }
}