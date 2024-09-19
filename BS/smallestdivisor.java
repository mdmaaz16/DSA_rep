package BS;
/* 
You are given an array of integers nums and an integer K, your task is to find the 
smallest positive integer divisor, such that upon dividing all the elements of the given array by it, 
the sum of the division's result is less than or equal to the given integer K.
Each result of the division is rounded to the nearest integer greater than or equal to 
that element. For Example: 7/3 = 3.
Example:
Input: 
A = [1 2 5 9]
6
Output:
5
Explanation:
If the divisor is 5 the sum will be 5 (1+1+1+2), which is less than 6.*/
class smallestdivisor {
    static int findmax(int a[]){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    } 
    static int check(int a[],int mid){
        int c=0;
        for(int i=0;i<a.length;i++){
            c += Math.ceil((double)(a[i]) / (double)(mid));
        }
        return c;
    }
    public static int smallestDivisor(int[] nums, int K) {
        int max=findmax(nums);
        int low=1,high=max,mid,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(check(nums,mid)<=K){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
