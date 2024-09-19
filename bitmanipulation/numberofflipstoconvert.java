//You are given two numbers A and B. The task is
 //to count the number of bits needed to be flipped to convert A to B.
package bitmanipulation;
 public class numberofflipstoconvert {
    public static void main(String[] args) {
        int a =10;
        int b = 20;
        int c = a^b;
        int res=0;
        while(c>0){
            // if(c%2==1){
            //     res++;
            // }
            // c/=2;
            res+=c&1;
            System.out.print(res);
            c=c<<2;
        }
        System.out.println(res);
    }
}
