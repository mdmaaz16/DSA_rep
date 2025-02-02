// Input: nums = [100,4,200,1,3,2]
// Output: 4
import java.util.*;
public class consectutivesequence {
    static void find(int a[]){
        Set<Integer> s =  new HashSet<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        int ans=-1;
        for(int x:s){
            if(!s.contains(x-1)){
                int n = x;
                int c=1;
                while(s.contains(n+1)){
                    n=n+1;
                    c++;
                }
                ans = Math.max(c,ans);
            }
        }
        System.out.print(ans);
    }
    public static void main(String[] args) {
        int a[] = {100,4,200,1,3,2};
        find(a);
    }
}

//solution  2
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=0,res=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            if(nums[i]==nums[i+1]-1){
                c++;
                res=Math.max(res,c);
            }
            else{
                c=0;
            }
        }
        if(nums.length==0){
            return 0;
        }
        return res+1;
    }
}