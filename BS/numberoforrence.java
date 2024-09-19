package BS;

class numberoforrence {
    static int firstelement(int a[],int x,int n){
        int low=0;
        int high=n-1;
        int mid;
        int first=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(a[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }
      static int lastelement(int a[],int x,int n){
        int low=0;
        int high=n-1;
        int mid;
        int last=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(a[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
    int count(int[] arr, int n, int x) {
        // code here
        int first=firstelement(arr,x,n);
        int last=lastelement(arr,x,n);
        if(first==-1){
            return 0;
        }
        int res=last-first+1;
        return res;
    }
}