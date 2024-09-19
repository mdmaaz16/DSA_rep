package stack;

import java.util.*;

class stackpermuation {
    public static int isStackPermutation(int n, int[] ip, int[] op) {
        // code here
        Stack<Integer> s = new Stack<>();
        // s.push(ip[0]);
         int j = 0; // Pointer for output array

        // Iterate through each element in the input array
        for (int i = 0; i < n; i++) {
            // Push the current element of the input array onto the stack
            s.push(ip[i]);

            // Keep popping from stack and move the pointer of the output array forward if the top of the stack matches the current element of the output array
            while (!s.isEmpty() && s.peek() == op[j]) {
                s.pop();
                j++;
            }
        }

        // If the stack is empty after processing both arrays, the output sequence is a valid stack permutation of the input sequence
        if (s.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }
}