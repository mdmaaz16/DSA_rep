// public class countzero {
//     static int fun(int n,int c){
//         if(n==0){
//             return c;
//         }
//         if(n%10==0){
//             c++;
//         }
//         n=n/10;
//         return fun(n,c);
//     }
//     public static void main(String[] args) {
        
//         int n=3010460;
//         System.out.println(fun(n,0));
//     }
// }
class countzero{
    static int count(int n,int c){
        if(n==0){
            return c;
        }
        if(n%10==0){
            c++;
            // System.out.println("Got");
        }
        return count(n/10,c);
    }
    public static void main(String[] args) {
        int n = 30104600;
        int res = count(n,0);
        System.out.print(res);
    }
}