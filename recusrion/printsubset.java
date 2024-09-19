import java.util.*;
public class printsubset {
    static void subset(int a[],int index,ArrayList arr){
        // System.out.println(index);
        if(index==a.length){
            System.out.println(arr);
            return;
        }
        arr.add(a[index]);
        // System.out.println(index);
        subset(a,index+1,arr);
        arr.remove(arr.size()-1);
        // System.out.println(" "+index);
        subset(a,index+1,arr);
        // System.out.println(" "+index);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        ArrayList<Integer> arr = new ArrayList<>();
        subset(a,0,arr);
    }
}


