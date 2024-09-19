package collectionframework;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(51);
        list.add(52);
        list.add(52);
        list.add(52);
        list.add(55);

        //System.out.print(list.get(0));

        //iterating
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        //enhanced loop
        for(int num:list){
            System.out.print(num+" ");
        }

        boolean b = list.contains(6); //to check for the value
        System.out.print(b);
        //iterator
        list.set(1,8);
        list.remove(0); //removing by index

        list.remove(Integer.valueOf(8)); //removing by value
        // System.out.print(f);

        Iterator<Integer> it =  list.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
