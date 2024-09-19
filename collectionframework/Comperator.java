package collectionframework;
import java.util.*;
public class Comperator {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 9, 4, 0, 5));
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);
        String [] s = {"maaz","zeehsani","nizami","hishami"};
        ArrayList<String> a = new ArrayList<>(Arrays.asList(s));
        Collections.sort(a);
        System.out.println(a);
        Comparator<String> c = new Comparator<String>(){
            public int compare(String s1,String s2){
                if(s1.length()<s2.length()){
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };
        Collections.sort(a,c);
        System.out.println(a);
    }
}
