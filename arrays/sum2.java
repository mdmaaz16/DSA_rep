// // Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
import java.util.*;
// public class sum2 {
//     public static void main(String[] args) {
//         int a[] = new int[2];
//         int num[] = {2,6,5,8,11};
//         int tar = 14;
//         Map<Integer,Integer> h = new HashMap<>();
//         for(int i=0;i<num.length;i++){
//             int n  = tar-num[i];
//             if(h.containsKey(n)){
//                 a[0] = h.get(n);
//                 a[1] = i;
//                 System.out.println(a[0]+" "+a[1]);
//                 return;
//             }
//             h.put(num[i],i);
//         }
//         //if()
//     }
// }
//2 pointer apporach

class sum2{
    public static void main(String[] args) {
        int num[] = {2,7,3,5,4};
        int tar = 12;
        Arrays.sort(num);
        int right = 0;
        int left = num.length-1;
        while(right<left){
            int sum = num[left]+num[right];
            if(sum==tar){
                System.out.println("found at index:"+right+" "+left);
            }
            if(sum<tar){
                right++;
            }
            else{
                left--;
            }

        }

    }
}