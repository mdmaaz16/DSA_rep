// // package arrays;
// Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
// Result: 3
// Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
import java.util.*;
public class subarraysumequaltok {
    // public static void main(String[] args) {
    //     int arr[] = {2,3,5,1,0,9};
    //     int start = 0,end = 0,k=10;
    //     int sum=0,maxLength=0;
    //     while(end<arr.length){
    //         sum+=arr[end];
    //         if(sum==k){
    //             maxLength = Math.max(maxLength,end-start+1);
    //         }
    //         while(sum>k && start<end){
    //             sum-=arr[start];
    //             start++;
    //         }
    //         end++;
    //     }
    //     System.out.println(maxLength);
    // }
    public static void main(String[] args) {
        int a[] = {2,3,5,1,0,9,0,0};
        int k=10,sum=0,maxLength=0;
        Map<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                maxLength  = Math.max(maxLength,i);
            }
            int rem = sum-k;
            if(h.containsKey(rem)){
                maxLength = Math.max(maxLength,i-h.get(rem));
            }
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
        }
        System.out.println(maxLength);
    }
}
