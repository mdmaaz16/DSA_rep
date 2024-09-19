package BS;
/*
 Given an array arr[] of n weights. Find the least weight capacity of a boat to ship 
 all weights within d days.
The ith weight has a weight of arr[i]. Each day, we load the boat with weights 
given by arr[i].We may not load more weight than the maximum weight capacity of the ship.

Note: You have to load weights on the boat in the given order.
Example 1:
Input:
n = 3
arr[] = {1, 2, 1}
d = 2
Output:
3
Explanation:
We can ship the weights in 2 days
in the following way:-
Day 1- 1,2
Day 2- 1
 */

class capacitytoshipddays {
    static Boolean calculate(int[] weights, int c, int days) {
        int daysNeeded = 1, currentLoad = 0;
        for (int weight : weights) {
            currentLoad += weight;
            if (currentLoad > c) {
                daysNeeded++;
                currentLoad = weight;
            }
        }

        return daysNeeded <= days;
    }
    static int leastWeightCapacity(int[] arr, int n, int d) {
        // code here
        int totalLoad = 0, maxLoad = 0;
        for (int weight : arr) {
            totalLoad += weight;
            maxLoad = Math.max(maxLoad, weight);
        }
        int low=maxLoad,high=totalLoad,mid;
        while(low<=high){
            mid=(low+high)/2;
            if(calculate(arr,mid,d)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}
