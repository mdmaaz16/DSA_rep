package subsets;
import java.util.*;
public class permutation {
    static void permutation(String s,List<String> l,boolean f[],StringBuilder b){
        if(s.length()==b.length()){
            l.add(b.toString());
            return;
        }
        for(int i=0;i<s.length();i++){
            if (f[i]) continue;
            if(i>0 && s.charAt(i)==s.charAt(i-1) && !f[i-1]){
                continue;
            }
            f[i]=true;
            b.append(s.charAt(i));
            permutation(s, l, f, b);
            b.deleteCharAt(b.length()-1);
            f[i]=false;
        }
    }
    public static void main(String[] args) {
        String s="122";
        char [] c = s.toCharArray();
        Arrays.sort(c);
        String s1 = new String(c);
        List<String> l = new ArrayList<>();
        boolean freq[]=new boolean[s.length()];
        permutation(s1,l,freq,new StringBuilder());
        HashSet<String> h = new HashSet<>(l);
        l.clear();
        l.addAll(h);
        Collections.sort(l);
        System.out.println(l);
    }
}
