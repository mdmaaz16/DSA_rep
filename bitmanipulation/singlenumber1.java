// a={1,1,2,3,3}
// o/p: 2
package bitmanipulation;
public class singlenumber1 {
    static int findnum(int a[]){
        int res=0;
        for(int i=0;i<a.length;i++){
            res=res^a[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int a[]={1,1,2,3,3};
        int n=findnum(a);
        System.out.println(n);
    }
}
