// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
public class movezerotoend {
    static void movezero(int a[]){
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                continue;
            }
            else{
                a[j++]=a[i];
            }
        }
        for(int i=j;i<a.length;i++){
            a[i] = 0;
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int a[] = {12};
        movezero(a);
    }
}
