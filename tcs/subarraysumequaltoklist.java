package tcs;
import java.util.*;
public class subarraysumequaltoklist {
    static List<Integer> extract(int start,int end,int a[]){
        List<Integer> l = new ArrayList<>();
        for(int i=start;i<=end;i++){
            l.add(a[i]);
        }
        return l;
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6},k=3;
        
        Map<Integer,Integer> m = new HashMap<>();
        // m.put(0,-1);

        int sum=0;
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                arr.add(extract(0,i,a));
            }
            int rem = sum-k;
            if(m.containsKey(rem)){
                arr.add(extract(m.get(rem)+1, i, a));
            }
            m.put(sum,i);
        }
        System.out.println(arr);
    }
}
