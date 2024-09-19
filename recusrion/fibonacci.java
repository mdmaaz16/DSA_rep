public class fibonacci {
    static int fib(int n)
    {
        if(n<=1)
        return n;
       // int l = fib(n-1);
        //int sl = fib(n-2);
        //System.out.print(n+" ");
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n=11;
        for(int i=0;i<n;i++)
        System.out.print(fib(i)+" ");
    }
    
}
