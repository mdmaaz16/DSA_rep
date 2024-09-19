package BS;

class painterpartition{
    static boolean check(int a[],long mid,int k){
        long last=a[0],l=1;
       //  System.out.println(mid);
        for(int i=1;i<a.length;i++){
            if(a[i]+last<=mid){
                last+=a[i];
            }
            else{
                last=a[i];
                l++;
            }
        }
       //  System.out.println(l);
        return l<=k;
    }
   static long minTime(int[] arr,int n,int k){
       //code here
       long low=arr[0],high=arr[0];
       for(int i=1;i<arr.length;i++){
           low=Math.max(low,arr[i]);
           high+=arr[i];
       }
       long mid,ans=0;
       while(low<=high){
           mid=(low+high)/2;
           if(check(arr,mid,k)){
               high=mid-1;
               ans=mid;
           }
           else{
               low=mid+1;
           }
       }
       return low;
   }
}