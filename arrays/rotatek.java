public class rotatek {
    static void rotateArray(int a[],int start,int end){
        while(start<=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int a[],int k){
        // for(int i=1;i<=k;i++){
        //     int temp = a[a.length-1];
        //     for(int j=a.length-1;j>0;j--){
        //         a[j]=a[j-1];
        //     }
        //     a[0] = temp;
        // }
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
        //optimized approach
        rotateArray(a,0,k);
        rotateArray(a,k+1,a.length-1);
        rotateArray(a,0,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7};
        int k=3;
        rotate(a,k);
    }
}
