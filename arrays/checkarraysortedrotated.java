public class checkarraysortedrotated {
    static boolean check(int a[]){
        int c=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                c++;
            }
        }
        if(a[a.length-1]>a[0]){
            c++;
        }
        if(c<=1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int a[] = {5,2,3,4};
        if(check(a)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
