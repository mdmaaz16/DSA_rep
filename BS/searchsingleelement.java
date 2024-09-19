// Given a sorted array arr[] of n positive integers having all the numbers occurring exactly twice, except for one number which will occur only once. Find the number occurring only once.

// Examples :

// Input: n = 5, arr[] = {1, 1, 2, 5, 5}
// Output: 2
// Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.
// Input: n = 7, arr[] = {2, 2, 5, 5, 20, 30, 30}
// Output: 20
// Explanation: Since 20 occurs once, while other numbers occur twice, 20 is the answer.
package BS;
class searchsingleelement {
    public static int search(int n, int arr[]) {
        // your code here
        if(n==1){
            return arr[0];
        }
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int low=1,high=n-2,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]){
                return arr[mid];
            }
            if(mid%2==0 && arr[mid]==arr[mid+1] || mid%2!=0 && arr[mid]==arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}