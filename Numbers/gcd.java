public class gcd {
    static int findgcd(int a,int b){
        if(a==0){
            return b;
        }
        return findgcd(b%a,b);
    }
    public static void main(String[] args) {
        int n1=4,n2=6;
        System.out.println(findgcd(n1,n2));
    }
}
