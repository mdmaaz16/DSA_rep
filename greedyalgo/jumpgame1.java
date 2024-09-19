// You are given an integer array nums. You are initially positioned at the array's first index, 
//and each element in the array represents your maximum jump length at that position.
// Return true if you can reach the last index, or false otherwise.
// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
package greedyalgo;
class jumpgame1 {
    public boolean canJump(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i>max){
                return false;
            }
            max = Math.max(max,i+nums[i]);
        }
        return true;
    }
}