package stack;

import java.util.Stack;

class nextsmallerelement {
    public static int[] help_classmate(int arr[], int n) {
        int a[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] <= s.peek()) {
                s.pop();
            }
            if (s.isEmpty()) {
                a[i] = -1;
            } else {
                a[i] = s.peek();
            }
            s.push(arr[i]);
        }
        return a;
    }
}


