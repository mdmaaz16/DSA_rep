public class subsetsums {
    static void subsetsum(int index,int a[],int sum){
       // System.out.println(index);
        if(index==a.length){
        System.out.print(sum+" ");
            return;
        }
        subsetsum(index+1, a, sum+a[index]);
        subsetsum(index+1, a, sum);

    }
    public static void main(String[] args) {
        int a[] = {1,2,3};
        subsetsum(0,a,0);
    }
}
