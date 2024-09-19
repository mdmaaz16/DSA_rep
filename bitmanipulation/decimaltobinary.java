package bitmanipulation;

public class decimaltobinary {
    static String convert(int n){
        String res="";
        while(n>0){
            if(n%2==0){
                res+=0;
            }
            else{
                res+=1;
            }
            n=n/2;
        }
        StringBuilder s = new StringBuilder(res);
        res=s.reverse().toString();
        // str.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int n=10;
        String res = convert(n);
        System.out.println(res);
    }
}
