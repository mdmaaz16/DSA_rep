import java.util.*;
// Input: nums = [1,1,0,1,1,1]
// Output: 3
public class maxconsectutiveones {
    static void solve(int n,int a[]){
        int ans = 0,c=0;
        // System.out.println(n);
        // for(int i=0;i<n;i++){
        //     System.out.println(a[i]);
        // }
        for(int i=0;i<n;i++){
            if(a[i]==1){
                c++;
                //System.out.println(ans);
            }
            else{
                c=0;
            }
            ans = Math.max(ans,c);
        }
        System.out.println("Max one is:"+ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            solve(n,a);
        }
    }
}
