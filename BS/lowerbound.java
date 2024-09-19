// Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
// Output: -1
// Explanation: No element less than 0 is found. So output is "-1".
// Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
// Output: 1
// Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
package BS;
public class lowerbound{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
        int index=-1;
        int low=0;
        int high=n-1;
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]<=x){
                low=mid+1;
                index=mid;
            }
            else{
                high=mid-1;
            }
        }
        return index;
    }
    
}
