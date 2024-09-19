import java.util.*;
public class subarraysumequal {
    public static void main(String[] args) {
        int a[] = {1,2,3};
        HashMap<Integer,Integer> h = new HashMap<>();
        int k=3,sum=0,c=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                c++;
            }
            int rem = sum-k;
            if(h.containsKey(rem)){
                c++;
            }
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
        }
        System.out.println(c);
    }
}
