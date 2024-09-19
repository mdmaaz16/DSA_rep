public class sumofdigits {
    static int sumofdig(int n){
        if(n==0){
            return 0;
        }
        int rem = n%10;
        n= n/10;
        return sumofdig(n)+rem;
    }
    public static void main(String[] args) {
        int n=34121;
        System.out.println(sumofdig(n));
    }
    
}
