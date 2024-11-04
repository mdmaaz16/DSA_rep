package tcs;

public class kadane {
    public static void main(String[] ar){
        int arr[] = {5, 4, 1, 7, 8};
        int sum = 0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        } 
        System.out.print(max);
    }
}
