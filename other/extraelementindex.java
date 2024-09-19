package other;
class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int low = 0;
        int high = n-1;
        int mid;
        while(low < high)
        {
            mid = (low + high)/2;
            if(a[mid] == b[mid])
            {
                low = mid + 1;
            }
            else
            {
                high = mid;
            }
        }
        return low;
    }