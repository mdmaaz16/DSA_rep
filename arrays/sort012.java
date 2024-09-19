public class sort012 {
    static void sortit(int a[]){
        int f=0,j=0,k=a.length-1;
      while(j<k){
        if(a[j]==0){
            int temp = a[f];
            a[f] = a[j];
            a[j] = temp;
            f++;
            j++;
        }
        else if(a[j]==1){
            j++;
        }
        else{
            int temp = a[j];
            a[j] = a[k];
            a[k] = temp;
            k--;
        }
      }
      for(int i=0;i<a.length;i++)
      System.out.print(a[i]+" ");
    }
    public static void main(String[] args) {
        int a[] = {0,1,2,0,0,0,2,1,1,1,2,2,0};
        sortit(a);
    }
}
