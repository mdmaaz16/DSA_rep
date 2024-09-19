package bitmanipulation;

public class oddoreven {
    public static void main(String[] args) {
        int n=3;
        int r=1;
        int res=n&r;
        if(res==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
