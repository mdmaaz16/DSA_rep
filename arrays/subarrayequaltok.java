import java.util.*;
public class subarrayequaltok {
    static void count(int a[],int k){
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,1);
        int sum=0,c=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            int rem = sum-k;
            c+=h.getOrDefault(rem,0 );
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int k=3;
        count(a,k);
    }
}
