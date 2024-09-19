package BS;

public class firtsandlastpositio {
    static int lowerbound(int a[],int x){
        int low=0,high=a.length-1,mid;
        int first=-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]>=x){
                first=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;

    }
    static int upperbound(int a[],int x){
        int low=0,high=a.length-1,mid;
        int last=a.length-1;
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]>x){
                last=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int a[]={2,4,6,8,8,8,11,13};
        int x=8;
        int f=lowerbound(a,x);
        int l = upperbound(a,x);
        System.out.println(f);
        if(a[l-1]==x){
            System.out.print("Found");
        }
        if(l==a.length || a[l-1]!=x){
            System.out.print("Not Found");
        }
    }
}
