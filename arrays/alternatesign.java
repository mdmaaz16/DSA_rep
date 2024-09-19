// arr[] = {1,2,-3,-1,-2,-3}, N = 6
// Output:
// 1 -3 2 -1 3 -2
public class alternatesign {
    public static void main(String[] args) {
        int a[] = {3,1,-2,-5,2,-4};
        int res [] = new int[a.length];
        int pos=0,neg=1;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                res[neg] = a[i];
                neg = neg+2;
            }
            else{
                res[pos] = a[i];
                pos = pos+2;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
