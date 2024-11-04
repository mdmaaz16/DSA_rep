package tcs;
import java.util.*;
class pair{
    int a;
    int b;
    pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}
public class sortelementbyfrequency {
    public static void main(String[] args) {
        int a[]={1,2,3,2,4,3,1,2};
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<a.length;i++){
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        Set<Integer> s = m.keySet();
        
        ArrayList<pair> arr = new ArrayList<>();
        for(Integer i:s){
            arr.add(new pair(i,m.get(i)));
            // System.out.println(i+" is "+m.get(i)+" ");
        }
         // Sort by frequency in ascending order
         Collections.sort(arr, (p1, p2) -> Integer.compare(p2.b, p1.b));
         for(int i=0;i<arr.size();i++){
            while(arr.get(i).b>0){
                System.out.print(arr.get(i).a+" ");
                arr.get(i).b--;
            }
         }
    }
}
