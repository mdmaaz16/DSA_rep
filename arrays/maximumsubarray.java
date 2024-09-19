// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
public class maximumsubarray {
    public static void main(String[] args) {
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            res=Math.max(res,sum);
            if(sum<=0){
                sum=0;
            }
        }
        System.out.println(res);
    }
}
