package BS;
// https://www.geeksforgeeks.org/problems/aggressive-cows/0
import java.util.*;
public class aggressivecows {
    static boolean check(int a[],int mid,int k){
        int c=1,last=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]-last>=mid){
                c++;
                last=a[i];
            }
            if(c>=k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a[]={1,2,4,8,9};
        Arrays.sort(a);
        int k=3;
        int high=a[0];
        for(int i=1;i<a.length;i++){
            high=Math.max(a[i],high);
        }
        int low=1,mid,ans=0;
        while(low<=high){
            mid=(low+high)/2;
            if(check(a,mid,k)){
                low=mid+1;
                ans=mid;
            }
            else{
                high=mid-1;
            }
        }
        System.out.println(ans);
    }
}
