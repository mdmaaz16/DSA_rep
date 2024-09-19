// package arrays;
// Find the elements that appears more than N/3 times in the array
// Example 2:
// Input Format
// :  N = 6, array[] = {11,33,33,11,33,11}
// Result:
//  11 33
import java.util.*;
public class majorityelement2 {
    static public void majority(int a[]){
        int c1=0,c2=0,ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(c1==0 && ele2!=a[i]){
                c1=1;
                ele1=a[i];
            }
            else if(c2==0 && ele1!=a[i]){
                c2=1;
                ele2=a[i];
            }
            else if(ele1==a[i]){
                c1++;
            }
            else if(ele2==a[i]){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==ele1){
                c1++;
            }
            if(a[i]==ele2){
                c2++;
            }
        }
        if(c1>a.length/3){
            System.out.println(ele1);
        }
        if(c2>a.length/3){
            System.out.print(ele2);
        }
    }
    public static void main(String[] args) {
        int a[]={11,22,33,11,33,11};
        majority(a);
    }
}
