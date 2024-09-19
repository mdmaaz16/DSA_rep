package stack;
import java.util.*;
public class infixtopostfix {
    static int getval(char c){
        if(c=='+' || c=='-'){
            return 1;
        }
        else if(c=='*' || c=='/'){
            return 2;
        }
        else{
            return 3;
        }
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String infix = "a+b*c+d";
        for(char c:infix.toCharArray()){
            if(Character.isLetter(c)){
                System.out.print(c);
            }
            else{
                if(s.isEmpty()){
                    s.push(c);
                }
                else{
                    char x = s.peek();
                    if(getval(x)<getval(c)){
                        s.push(c);
                    }
                    else{
                        while (!s.isEmpty() && getval(s.peek()) >= getval(c)) {
                            System.out.print(s.pop());
                        }
                        s.push(c);
                    }
                }
            }
        }
        while(!s.isEmpty()){
            System.out.print(s.pop());
        }
    }
}
