public class palindrome {
    static boolean fun(int i,String s,int n)
    {
        if(i>n/2+1)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1))
        {
            return false;
        }
        return fun(i+1,s,n);
    }
    public static void main(String[] args) {
        String s = "maddamm";
        boolean x=fun(0,s,s.length());
        System.out.println(x);
    }
}
