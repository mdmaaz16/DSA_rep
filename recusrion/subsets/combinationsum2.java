package subsets;
// arr=[1,1,1,2,2] target=4
// op:[[1,1,2],[2,2]]
import java.util.*;
public class combinationsum2 {
    static void combination(int index,int a[],int t,List<List<Integer>> l,List<Integer> list){
        if(t==0){
            l.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<a.length;i++){
            if(i>index && a[i]==a[i-1])continue;
            if(a[i]>t) break;
            list.add(a[i]);
            combination(i+1,a,t-a[i],l,list);
            list.remove(list.size()-1);
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        int a[]={1,1,1,2,2};
        combination(0,a,5,l,new ArrayList<Integer>());
        System.out.println(l);
    }
}
