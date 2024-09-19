// public class reversenum {
//     static int reverseval(int n,int ans){
//         if(n==0){
//             return ans;
//         }
//         int rem=n%10;
//         n=n/10;
//         return reverseval(n, ans*10+rem);
//     }
//     public static void main(String[] args) {
//         int n = 34512;
//         System.out.println(reverseval(n,0));

//     }   
// }

class reversenum{
    static int rev(int n,int res){
        if(n==0){
            return res;
        }
        int num = n%10;
        res=res*10+num;
        return rev(n/10,res);
    }
    public static void main(String[] args) {
        int n = 321;
        int res = rev(n,0);
        System.out.println(res);
    }
}