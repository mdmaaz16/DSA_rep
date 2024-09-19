
import java.util.*;
// Input: n = 6, arr[] = {16,17,4,3,5,2}
// Output: 17 5 2
// Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
class leadersinarray {
    // Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int n, int arr[]) {
        // Your code here
        ArrayList<Integer> a = new ArrayList<>();
        a.add(arr[n-1]);
        int max=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=arr[i+1] && arr[i]>=max){
                max=arr[i];
                a.add(arr[i]);
            }
        }
        Collections.reverse(a);
        return a;
    }
}
