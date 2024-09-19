package bitmanipulation;

public class floorceil {
    public static int ceil(int a[],int x){
        int low=0,ans=0,mid,high=a.length-1;
        while(low<=high){
            mid = (low+high)/2;
            if(a[mid]>=x){
                high=mid-1;
                ans=a[mid];
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int floor(int a[],int x){
        int low=0,ans=0,mid,high=a.length-1;
        while(low<=high){
            mid = (low+high)/2;
            if(a[mid]<=x){
                low=mid+1;
                ans=a[mid];
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=6,arr[] ={3, 4, 4, 7, 8, 10};
        int x=5;
        System.out.println(floor(arr,x));
        System.out.println(ceil(arr,x));
        
    }
}
