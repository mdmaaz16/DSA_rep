public class kadane {
    static int solve(int a[]){
        int sum = 0,maxsum = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            maxsum = Math.max(sum,maxsum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = solve(a);
        System.out.println(n);
    }
}
