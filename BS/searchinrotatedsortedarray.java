package BS;
//7 8 9 1 2 3 4 5 6 key = 1 use logn time
public class searchinrotatedsortedarray {
    public static void main(String[] args) {
        int a[]={7,8,9,1,2,3,4,5,6};
        int x=1;
        int low=0;
        int high=a.length-1;
        int mid=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==x){
                break;
            }
            if(a[low]<a[mid]){
                if(a[low]<=x && x<=a[high]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(a[mid]<=x && x<=a[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        System.out.println(mid);
    }
}
