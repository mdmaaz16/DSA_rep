package dp;
// You are a professional robber planning to rob houses along a street. 
//Each house has a certain amount of money stashed. All houses at this place are arranged in a circle.
//That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a 
//security system connected, and it will automatically contact the police if two adjacent houses
// were broken into on the same night.

// Given an integer array nums representing the amount of money of each house, return the 
//maximum amount of money you can rob tonight without alerting the police.
// Example 1:
// Input: nums = [2,3,2]
// Output: 3
// Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2),
// because they are adjacent houses.
class houserobber2 {
    int find(int nums[]){
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<nums.length;i++){
            int take=nums[i];
            if(i>1){
                take+=prev2;
            }
            int notake = prev;
            int cur = Math.max(take,notake);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int a[] = new int[nums.length-1];
        int b[] = new int[nums.length-1];
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i++){
            a[i]=nums[i];
        }
        int j=0;
        for(int i=1;i<nums.length;i++){
            b[j++]=nums[i];
        }
        return Math.max(find(a),find(b));
    }
}