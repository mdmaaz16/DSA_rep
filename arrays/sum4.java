// package arrays;

import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int k,l;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                k=j+1;
                l=nums.length-1;
                while(k<l){
                    List<Integer> l1 = new ArrayList<>();
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum==target){
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(nums[k]);
                        l1.add(nums[l]);
                        list.add(l1);
                        while (k < l && nums[k] == nums[k + 1]) k++;
                        while (k < l && nums[l] == nums[l - 1]) l--;
                        k++;
                        l--;
                    }
                    else if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                }
            }
        }
        return list;
    }
}