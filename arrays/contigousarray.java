import java.util.*;
public class contigousarray {
    public static void main(String[] args) {
        int a[] = {1,0,0,1};
        HashMap<Integer,Integer> h = new HashMap<>();
        h.put(0,-1);
        int sum=0,max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                sum+=1;
            }
            else if(a[i]==0){
                sum-=1;
            }
            if(h.containsKey(sum)){
                max = Math.max(max,i-h.get(sum));
            }else
            h.put(sum,i);
        }
        System.out.println(max);
    }    
}
