//Check if the given string is shuffled substring of another string
// Input: str1 = “onetwofour”, str2 = “hellofourtwooneworld” 
// Output: YES 
// Explanation: str1 is substring in shuffled form of str2 as 
// str2 = “hello” + “fourtwoone” + “world” 
// str2 = “hello” + str1 + “world”, where str1 = “fourtwoone” (shuffled form) 
// Hence, str1 is a substring of str2 in shuffled form.

import java.util.Scanner;
import java.util.*;
public class shufflessubstring {
    static String sort(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()>s2.length()){
            System.out.println("Not possible");
            return;
        }
        s1=sort(s1);
        System.out.println(s1);
        for(int i=0;i<s2.length();i++){
            if(i+s1.length()>=s2.length()){
                return;
            }
            String s="";
            for(int j=0;j<s1.length();j++){
                s+=s2.charAt(i+j);
            }
            s=sort(s);
            System.out.println(s);
            if(s1.equals(s)){
                System.out.println("Possible");
                return;
            }
        }
        System.out.println("Not Possible");
    }
}
