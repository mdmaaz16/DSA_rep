package bitmanipulation;
import java.util.*;
public class powerset {
    public static void main(String[] args) {
        int n[]={1,2,3};
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        int subset = 1<<n.length;
        for(int i=0;i<subset;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<n.length;j++){
                if((i&(1<<j))!=0){
                    list.add(n[j]);
                }
            }
            a.add(list);
        }
        System.out.println(a);
    }
}
