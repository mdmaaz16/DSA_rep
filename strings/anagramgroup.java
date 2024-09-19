package strings;

import java.util.*;
class anagramgroup {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to group anagrams by their sorted string
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate over the strings
        for (String str : strs) {
            // Convert the string to a char array, sort it, and create a new sorted string
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedStr = new String(c);
            
            // Add the original string to the map using the sorted string as the key
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        
        // Collect all the anagram groups into a list of lists
        List<List<String>> l = new ArrayList<>(map.values());

        // Sort the list of lists based on the size of the inner lists
        l.sort((list1, list2) -> Integer.compare(list1.size(), list2.size()));
        
        return l;
    }
}