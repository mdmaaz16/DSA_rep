package subsets;
import java.util.*;

class printsubseq{
    static void subseq(int ind,int a[],ArrayList arr){
        if(ind==a.length){
            System.out.println(arr);
            return;
        }
        arr.add(a[ind]);
        subseq(ind+1,a,arr);
        arr.remove(arr.size()-1);
        subseq(ind+1,a,arr);

        
    }
    public static void main(String[] args) {
        int a[]={3,1,6,1};
        ArrayList<Integer> arr = new ArrayList<>();
        subseq(0,a,arr);
    }
}
