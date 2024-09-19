public class linearsearch {
    static boolean linear(int a[],int k,int i){
        if(i==a.length){
            return false;
        }
        if(a[i]==k){
            return true;
        }
        return linear(a, k, i+1);
    }
    public static void main(String[] args) {
        int a[]={3,4,5,6,1,2,9,0};
        int key=10;
        System.out.println(linear(a,key,0));
    }
}
