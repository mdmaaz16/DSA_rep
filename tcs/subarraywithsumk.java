package tcs;
import java.util.*;
public class subarraywithsumk {
    public static void main(String[] args) {
        int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;

        // Map to store the cumulative sum and its index
        Map<Integer, Integer> m = new HashMap<>();
        int cumulativeSum = 0;

        // Initialize map with base case: sum 0 at index -1
        // m.put(0, -1);

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];  // Calculate cumulative sum

            // If the cumulative sum equals the target sum, subarray starts from index 0
            if (cumulativeSum == sum) {
                System.out.println("Subarray found from index 0 to " + i);
                break;
            }

            // Calculate remainder (cumulativeSum - sum)
            int rem = cumulativeSum - sum;

            // If remainder is found in the map, a subarray is found
            if (m.containsKey(rem)) {
                int start = m.get(rem) + 1;
                System.out.println("Subarray found from index " + start + " to " + i);
                break;
            }

            // Store the current cumulative sum and its index
            m.put(cumulativeSum, i);
        }
    }   
}
