package subsets;
import java.util.*;

public class subseqequaltok {
    static void subseq(int index, int a[], ArrayList<Integer> arr, int sum, int k) {
        // Check if the current sum is equal to k
        if (sum == k) {
            System.out.println(arr);
            return;
        }

        // If the index is out of bounds or sum exceeds k, stop recursion
        if (index >= a.length || sum > k) {
            return;
        }

        // Include the current element
        arr.add(a[index]);
        sum+=a[index];
        subseq(index + 1, a, arr, sum, k);

        // Exclude the current element
        sum-=a[index];
        arr.remove(arr.size() - 1);
        subseq(index + 1, a, arr, sum, k);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a[] = {3, 1, 2,5,6,8,12,45,2,3,1,3,4,3,1};
        int k = 6;  // Example value for k
        subseq(0, a, arr, 0, k);
    }
}
