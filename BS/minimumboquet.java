package BS;
/*
You are given an integer array bloomDay, an integer m and an integer k.
You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.
The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then 
can be used in exactly one bouquet.
Return the minimum number of days you need to wait to be able to make m bouquets from the garden. 
If it is impossible to make m bouquets return -1.
Example 1:
Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
*/
class minimumboquet {
    static int findmax(int a[]){
        int max = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

    static int findmin(int a[]){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    static boolean possible(int a[], int day, int m, int k){
        int c = 0, b = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] <= day){
                c++;
                if(c == k){
                    b++;
                    c = 0;
                }
            } else {
                c = 0;
            }
        }
        return b >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int res = m * k;
        if(bloomDay.length < res){
            return -1;
        }

        int max = findmax(bloomDay);
        int min = findmin(bloomDay);
        int low = min, high = max, ans = -1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(possible(bloomDay, mid, m, k)){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}