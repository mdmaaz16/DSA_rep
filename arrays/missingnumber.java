public class missingnumber {
    static void solve(int a[]){
        int n =a.length;
        int sum = n*(n+1)/2;
        int s1=0;
        for(int i=0;i<n;i++){
            s1+=a[i];
        }
        int res = sum-s1; 
        System.out.println("missing number is:"+res);
    }
    public static void main(String[] args) {
        // 9,6,4,2,3,5,7,0,1
        int a[] = {9,6,4,2,3,5,7,0,1};
        solve(a);
    }
}
