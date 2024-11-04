package tcs;
import java.util.*;
public class majortyelement {
    public static void main(String[] args) {
        int a[] = {1,2,1,1,1,2,3,4,1};
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<a.length;i++){
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        Set<Integer> s = m.keySet();
        for(Integer i:s){
            if(m.get(i)>=a.length/2){
                System.out.print(i+"  "+m.get(i));
            }
        }
        
    }
}
