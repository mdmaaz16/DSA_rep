// a=[1,2,2]
// o/p: [[],[1],[1,2],[1,2,2],[2],[2,2]]
//The solution must not contain duplicate subsets. Solution can be in any order
package subsets;
import java.util.*;

public class subsetsum2 {
    static void subset(int index,int a[],List<List<Integer>> l,List<Integer> list){
        l.add(new ArrayList<>(list));
        for(int i=index;i<a.length;i++){
            if(i!=index && a[i]==a[i-1]) continue;
            list.add(a[i]);
            subset(i+1,a,l,list);
            list.remove(list.size()-1);
            // subset(i+1, a, l, list);
        }
    }
    public static void main(String[] args) {
        int a[]={1,2,2};
        Arrays.sort(a);
        List<List<Integer>> list = new ArrayList<>();
        subset(0,a,list,new ArrayList<>());
        System.out.println(list);
    }
}
