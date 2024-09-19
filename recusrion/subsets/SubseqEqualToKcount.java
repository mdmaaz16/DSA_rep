package subsets;
import java.util.*;

public class SubseqEqualToKcount {
    static int subseq(int index, int a[], ArrayList<Integer> arr, int sum, int k) {
        // Base case: If the current sum is equal to k
        if (sum == k) {
            // System.out.println(arr); // Uncomment this line if you want to print the subsequences
            return 1;
        }

        // If the index is out of bounds or sum exceeds k, stop recursion
        if (index >= a.length || sum > k) {
            return 0;
        }

        // Include the current element
        arr.add(a[index]);
        sum += a[index];
        int countIncluding = subseq(index + 1, a, arr, sum, k);

        // Exclude the current element
        sum -= a[index];
        arr.remove(arr.size() - 1);
        int countExcluding = subseq(index + 1, a, arr, sum, k);

        // Return the total count
        return countIncluding + countExcluding;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a[] = {3, 1,2};
        int k = 3;  // Example value for k
        int count = subseq(0, a, arr, 0, k);
        System.out.println("Number of subsequences with sum equal to " + k + " is: " + count);
    }
}
