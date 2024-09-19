package stack;
import java.util.*;

class deletemiddle
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        int temp[] = new int[sizeOfStack/2]; 
        int k=0;
        for(int i=1;i<=sizeOfStack/2;i++){
            temp[k]=s.pop();
            k++;
        }
        s.pop();
        for(int i=sizeOfStack/2-1;i>=0;i--){
            s.push(temp[i]);
        }
    } 
}