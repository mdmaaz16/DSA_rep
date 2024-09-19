// class reversearray
// {
//     static void fun(int i,int a[],int n){
//         if(i>=n/2){
//             return;
//         }
//         int temp = a[i];
//         a[i] = a[n-i-1];
//         a[n-i-1] = temp;
//         fun(i+1,a,n);
//     }
//     public static void main(String[] ar)
//     {
//         int a[] = {1,2,3,4,5};
//         fun(0,a,5);
//         for(int i=0;i<a.length;i++)
//         System.out.print(a[i]+ " ");
//     }
// }

class reversearray{
    static void reverse(int a[],int start,int end){
        if(start>end){
            return;
        }
        // System.out.println(start);
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reverse(a, ++start, --end);
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        reverse(a,0,4);
        for(int i=0;i<5;i++){
            System.out.print(a[i]+" ");
        }
    }
}