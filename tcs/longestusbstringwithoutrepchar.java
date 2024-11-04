package tcs;
import java.util.*;
public class longestusbstringwithoutrepchar {
    public static void main(String[] args) {
        String s ="aaa";
        int c=0,max=0;
        for(int i=0;i<s.length();i++){
            ArrayList<Character> a = new ArrayList<>();
            for(int j=i+1;j<s.length()-1;j++){
                if(s.charAt(j)!=s.charAt(j+1) && !a.contains(s.charAt(j))){
                    c++;
                    a.add(s.charAt(j));
                }
                else{
                    break;
                }
                
            }
            if(!a.contains(s.charAt(i))){
                c++;
            }
            max=Math.max(max,c);
            c=0;
        }
        System.out.println(max);
    }
}
