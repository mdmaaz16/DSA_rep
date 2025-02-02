package BS;
// Given a sorted array of distinct integers and a target value, return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:
// Input: nums = [1,3,5,6], target = 2
// Output: 1
class searchandinsert {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int mid;
        int index=0;
        int high=nums.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]==target){
                index=mid;
                break;
            }
            if(nums[mid]>target){
                index=mid;
                high=mid-1;
            }
            else{
                index=mid+1;
                low=mid+1;
            }
        }
        if(index==0){
            return 0;
        }   
        return index;
    }
}
