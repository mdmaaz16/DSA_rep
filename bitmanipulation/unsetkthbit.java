package bitmanipulation;
class unsetkthbit
{
    public static void main(String[] args) {
       int n = 13;
       int k = 2;
       int b = 1<<k;
       int r = ~(b);
       int res = n&r;
       System.out.println(res);  
    }
}