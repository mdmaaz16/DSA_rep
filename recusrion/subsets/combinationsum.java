package subsets;
// Input: candidates = [2,3,6,7], target = 7
// Output: [[2,2,3],[7]]
import java.util.*;
public class combinationsum {
    static void subseq(int in,int a[],int t,List<List<Integer>> l,List<Integer> ans){
        if(in==a.length){
            if(t==0){
                l.add(new ArrayList<>(ans));
            }
            return;
        }
        if(a[in]<=t){
            ans.add(a[in]);
            subseq(in,a,t-a[in],l,ans);
            ans.remove(ans.size()-1);
        }
        subseq(in+1,a,t,l,ans);
    }
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        int a[]={2,3,6,7};
        subseq(0,a,7,l,new ArrayList<>());
        System.out.println(l);
    }
}
