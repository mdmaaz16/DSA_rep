package stack;
import java.util.*;

class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        long a[] = new long[n];
        int k=n-1;
        Stack<Long> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(s.isEmpty()){
                a[k--]=-1;
                s.push(arr[i]);
            }
            else{
                if(arr[i]<s.peek()){
                    a[k--]=s.peek();
                    s.push(arr[i]);
                }
                else{
                    while(!s.isEmpty() && arr[i]>=s.peek()){
                        s.pop();
                    }
                    if(s.isEmpty()){
                        a[k--]=-1;
                        s.push(arr[i]);
                    }
                    else{
                        a[k--]=s.peek();
                        s.push(arr[i]);
                    }
                }
            }
        }
        return a;
    } 
}