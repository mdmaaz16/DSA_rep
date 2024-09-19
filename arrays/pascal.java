import java.util.*;
public class pascal {
    static ArrayList<Integer> construct(int i){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        int ans=1;
        for(int col=1;col<i;col++){
            ans=ans*(i-col);
            ans=ans/col;
            a.add(ans);
        }
        return a;
    }
    public static void main(String[] args) {
        int n=6;
        List<List<Integer>> arr = new ArrayList<>();
        for(int row=1;row<=n;row++){
            List<Integer> l = new ArrayList<>();
            l=construct(row);
            arr.add(l);
        }
        // System.out.print(arr);
        for(List<Integer> a:arr){
            for(Integer x:a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
