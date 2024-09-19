package stack;
import java.util.*;

public class reversestack {
    static void insertatbottom(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int a=s.peek();
        s.pop();
        insertatbottom(s,x);
        s.push(a);
    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int x=s.peek();
        s.pop();
        reverse(s);
        insertatbottom(s,x);
    }
    static void display(Stack<Integer> s){
        while(!s.empty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    public static void main(String[] args) {
        int n=5;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            s.push(a);
        }
        reverse(s);
        display(s);
    }
}
