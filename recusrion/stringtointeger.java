public class stringtointeger {
    static int convert(int n,String s,int res){
        if(n==s.length()){
            return res;
        }
        if(s.charAt(n)==' '){
            return convert(n+1,s,res);
        }
        if(s.charAt(n)=='-' || s.charAt(n)=='+'){
            res = (s.charAt(n)=='-')?-1:+1;
            return convert(n+1,s,res);
        }
        if(Character.isDigit(s.charAt(n))){
            res=res*10+(int)s.charAt(n)-'0';
            return convert(n+1,s,res);
        }
        else{
            return res;
        }
    }
    public static void main(String[] args) {
        String s = " 45abc";
        int n = convert(0,s,0);
        System.out.println(n);
    }
}

//normal
// class Solution {
//     public int myAtoi(String s) {
//          int i = 0, sign = 1, result = 0;
//         int n = s.length();
        
//         // Step 1: Ignore leading whitespace
//         while (i < n && s.charAt(i) == ' ') {
//             i++;
//         }
        
//         // Step 2: Check if the next character is '-' or '+'
//         if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
//             sign = (s.charAt(i) == '-') ? -1 : 1;
//             i++;
//         }
        
//         // Step 3: Read the integer and stop at the first non-digit character
//         while (i < n && Character.isDigit(s.charAt(i))) {
//             int digit = s.charAt(i) - '0';
            
//             // Step 4: Check for overflow and round to 32-bit integer limits
//             if (result > (Integer.MAX_VALUE - digit) / 10) {
//                 return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
//             }
            
//             result = result * 10 + digit;
//             i++;
//         }
        
//         return result * sign;
//     }
// }