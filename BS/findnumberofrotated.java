package BS;
//The appraoch is to find the minimum element index which will be the no of times the array was roated
class findnumberofrotated {
    public int findMin(int[] nums) {
        // int min=nums[0];
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]<min){
        //         min=nums[i];
        //     }
        // }
        // return min;

        int low=0;
        int high=nums.length-1;
        int min=Integer.MAX_VALUE;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(nums[mid]>=nums[low]){
                min=Math.min(min,nums[low]);
                low=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                high=mid-1;
            }
        }
        return min;
    }
}
