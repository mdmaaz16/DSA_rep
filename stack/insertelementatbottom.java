package stack;

import java.util.*;
class insertelementatbottom {
    void solve(Stack<Integer> s,int x){
        if(s.isEmpty()){
            s.push(x);
            return;
        }
        int a=s.peek();
        s.pop();
        solve(s,x);
        s.push(a);
    }
    
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        solve(st,x);
        return st;
    }
}