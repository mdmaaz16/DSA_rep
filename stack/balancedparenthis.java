package stack;
import java.util.*;
class stack1{
    int top;
    int size=20;
    char c[];

    stack1(int capacity){
        top=-1;
        c=new char[capacity];
    }

    void push(char s){
        if(top==c.length-1){
            System.out.println("Stack overflow");
        }
        c[++top]=s;
    }
    char pop(){
        char val =c[top]; 
        top--;
        return val;
    }
    int topval(){
        return top;
    }
}

public class balancedparenthis {
    public static void main(String[] args) {
        String s = "[()]{]";
        stack1 S = new stack1(s.length());
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                S.push(s.charAt(i));
            }
            else{
                char temp = S.pop();
                if((s.charAt(i)==')' && temp!='(') || (s.charAt(i)=='}' && temp!='{') || (s.charAt(i)==']' && temp!='[')){
                    System.out.println("Mismatch");
                    return;
                }
            }
        }
        if(S.topval()==-1){
            System.out.println("Matched");
        }
        else{
            System.out.println("Not Match");
        }
    }
}
