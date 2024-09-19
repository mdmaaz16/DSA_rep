package slidingwindow;

class maxconsecutiveoneflip {
    public int longestOnes(int[] nums, int k) {
        int count=0,flip=0,start=0,res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flip++;
                while(flip>k){
                    if(nums[start]==0)
                        flip--;
                    start++;
                }
            } 
            res=Math.max(res,i-start+1);
        }
         return res;
    }
}