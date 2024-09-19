package stack;
import java.util.*;

public class sortastack {
    static void sortit(Stack<Integer> s,int x){
        if(s.isEmpty() || s.peek()<x){
            s.push(x);
            return;
        }
        int a=s.peek();
        s.pop();
        sortit(s,x);
        s.push(a);
    }
    static void sortStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int a=s.peek();
        s.pop();
        sortStack(s);
        sortit(s,a);
    }
    static void display(Stack<Integer> s){
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    public static void main(String[] args) {
        int n=3;
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            s.push(a);
        }
        sortStack(s);
        display(s);
    }
}
