import java.util.*;
public class subarraysequal0and1 {
    public static void main(String[] args) {
        int a[] = {1,0,0,1};
        Map<Integer,Integer>  m = new HashMap<>();
        m.put(0,-1);
        int sum=0;
        int res=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0){
                sum+=-1;
            }
            else if(a[i]==1){
                sum+=1;
            }
            if(m.containsKey(sum)){
                res=Math.max(res, i-m.get(sum));
            }
            else{
                m.put(sum,i);
            }
        }
        System.out.print(res);
    }
}
