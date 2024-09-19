package sortingtechniques;
import java.util.*;
class merge{
    public static void mergeSort(int a[],int low,int high){
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
    }
    public static void merge(int a[],int l,int m,int h){
        int left = l;
        int right = m+1;
        ArrayList<Integer> arr  = new ArrayList<>();
        while(left<=m && right<=h){
            if(a[left]<=a[right]){
                arr.add(a[left]);
                left++;
            }
            else{
                arr.add(a[right]);
                right++;
            }
        }
        while(left<=m){
            arr.add(a[left]);
                left++;
        }
        while(right<=h){
            arr.add(a[right]);
            right++;
        }
        for(int i=0;i<arr.size();i++){
            a[l + i] = arr.get(i);
        }
    }
    public static void main(String[] args) {
        int a[] = {2,1,3,5,6,7,8};
        int low=0,high=a.length-1;
        mergeSort(a,low,high);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}