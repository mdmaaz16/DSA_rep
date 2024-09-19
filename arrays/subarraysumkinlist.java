import java.util.*;

public class subarraysumkinlist {
    
    static void findVal(int[] a, int k) {
        int sum = 0;
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> sumMap = new HashMap<>();
        
        // Initialize with sum 0 at index -1 to handle subarrays starting from index 0
        sumMap.put(0, -1);

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            int rem = sum - k;

            // Check if the required sum (cumulative sum - k) is in the map
            if (sumMap.containsKey(rem)) {
                int start = sumMap.get(rem) + 1;
                List<Integer> subarray = new ArrayList<>();
                for (int j = start; j <= i; j++) {
                    subarray.add(a[j]);
                }
                result.add(subarray);
            }

            // Add or update the current cumulative sum in the map
            sumMap.put(sum, i);
        }

        // Print the result
        System.out.println(result);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1, -3, 2, -1};
        int k = 3;
        findVal(a, k);
    }
}
