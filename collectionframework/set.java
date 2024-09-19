package collectionframework;
import java.util.*;
public class set {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(2);
        s.add(2);
        s.add(3);
        s.add(5);
        s.add(10);
        s.add(17);

        s.remove(2); //remove element by value
        System.out.println(s.contains(10));
        System.out.println(s);
        Iterator<Integer> i = s.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }

        //another way
        for(int j:s){
            System.out.print(j+" ");
        }
    }
}
