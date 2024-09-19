package bitmanipulation;

public class countsetbits {
    public static void main(String[] args) {
        int n=15,c=0;
        while(n>0){
            if(n%2==1){
                c++;
            }
            n=n/2;
        }
        System.out.println(c);
    }
}
