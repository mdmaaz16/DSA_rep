public class primefactorsoptimized {
    public static void main(String[] args) {
        int n=10080;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
            while(n%i==0){
                System.out.print(i + " ");
                n/=i;
            }
        }
        if(n!=1){
            System.out.print(n);
        }
    }
}
