package stack;
import java.util.*;
// Input:
// exp = ((a+b))
// Output:
// Yes
// Explanation:
// ((a+b)) can reduced to (a+b).
// Example 2:

// Input:
// exp = (a+b+(c+d))
// Output:
// No
// Explanation:
// (a+b+(c+d)) doesn't have any redundant or multiple
// brackets.
class checkredundancy {
    public static int checkRedundancy(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        int x=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='+' ||s.charAt(i)=='-' ||s.charAt(i)=='*' ||s.charAt(i)=='/'){
                st.push(s.charAt(i));
            }
            else{
                x=0;
                if(s.charAt(i)==')'){
                    while(st.peek()!='('){
                        char top=st.peek();
                        if(top=='+' || top=='-' || top=='*' ||top=='/'){
                            x=1;
                        }
                        st.pop();
                    }
                    if(x==0){
                        return 1;
                    }
                    st.pop();
                }
            }
        }
        return 0;
    }
}
        
