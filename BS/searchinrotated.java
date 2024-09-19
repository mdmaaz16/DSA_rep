package BS;

public class searchinrotated {
    static int search(int a[],int k){
        int low=0,high=a.length-1,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==k){
                return mid;
            }
            if(a[low]<=a[mid]){
                if(a[low]<=k && k<=a[mid]){
                    high=mid-1;                    
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(a[mid]<=k && k<=a[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                    
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2,3}, k = 0;
        System.out.println(search(arr,k));
    }
}
