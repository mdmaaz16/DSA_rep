import java.util.*;
public class longestsubstringwithoutrepchar {
    public static void main(String[] ar){
        // String s = "abcdabcdef";
        // int max=0,j;
        // for(int i=0;i<s.length();i++){
        //     int c=0;
        //     ArrayList<Character> a = new ArrayList<>();
        //     for(j=i;j<s.length()-1;j++){
        //         if(s.charAt(j)!=s.charAt(j+1) && !a.contains(s.charAt(j))){
        //             a.add(s.charAt(j));
        //             c++;
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     if(!a.contains(s.charAt(j))){
        //         c++;
        //     }
        //     max=Math.max(c,max);
        // }
        // System.out.println(max);


        //optimized one
        Map<Character,Integer> m = new HashMap<>();
        String s = "abcdabcdef";
        int start=0,max=0;
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                start = Math.max(start,m.get(s.charAt(i))+1);
            }
            max=Math.max(max,i-start+1);
            m.put(s.charAt(i),i);
        }
        System.out.println(max);

    }
}
