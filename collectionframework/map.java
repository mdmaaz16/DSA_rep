package collectionframework;
import java.util.*;
public class map {
    public static void addToMap(Map<Integer, List<Integer>> map, Integer key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
        //see anagram example
    }
    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(1,1);
        m.put(2,3);
        m.put(5,7);
        m.put(6,10);
        m.put(3,11);
        m.put(4,15);

        // System.out.printlnln(m);

        int n = m.get(1); //getting value
        System.out.println(n);

        m.remove(1); //remove the value and the key
        System.out.println(m);

        boolean contains = m.containsKey(2); // check if key present
        System.out.println(contains);

        Set<Integer> s = m.keySet(); //gets all the keys and stores in set
        System.out.println(s);

        Collection<Integer> v = m.values();
        System.out.println(v);

        //Traversing can be done in many ways
        //I have shown only two ways here

        Set<Integer> s1 = m.keySet();
        for(Integer n1:s1){
            System.out.print(m.get(n1)+" ");
        }
        System.out.println("\n");
        Collection<Integer> c1 = m.values();
        for(Integer l:c1){
            System.out.print(l+" ");
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        
        // Adding values
        addToMap(map, 1, 10);
        addToMap(map, 1, 20);
        addToMap(map, 2, 30);
        addToMap(map, 2, 40);
        addToMap(map, 3, 50);
        
        // Display the map
        System.out.println(map);

        // Search for a key
        List<Integer> result = map.get(2);
        System.out.println("Values for key 2: " + result);
    }

}
    
    // Method to add values to the map
   