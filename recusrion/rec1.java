class rec1
{
    static int fun(int n)
    {

        if(n==1)
        return 1;

        return n*fun(n-1);
    }
    public static void main(String[] ar)
    {
        int n=5;

        System.out.println(fun(n));
    }
}