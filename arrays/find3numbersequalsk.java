// Input:
// n = 6, X = 13
// arr[] = [1 4 45 6 10 8]
// Output:
// 1
// Explanation:
// The triplet {1, 4, 8} in 
// the array sums up to 13.
import java.util.*;
class find3numbersequalsk
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int A[], int n, int X) { 
    
       // Your code Here
       int i,j,k=0;
       Arrays.sort(A);
       for(i=0;i<n;i++){
           j=i+1;
           k=n-1;
           while(j<k){
               int sum=A[i]+A[j]+A[k];
               if(sum==X){
                   return true;
               }
               else if(sum<X && j<k){
                   j++;
               }
               else if(sum>X && k>j){
                   k--;
               }
           }
       }
       return false;
    
    }
}
