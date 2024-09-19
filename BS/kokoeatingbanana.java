package BS;

// Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas.
//  The guards have gone and will come back in h hours.
// Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of 
// bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of 
// them instead and will not eat any more bananas during this hour.
// Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
// Return the minimum integer k such that she can eat all the bananas within h hours.
// Example 1:
// Input: piles = [3,6,7,11], h = 8
// Output: 4
// Example 2:
// Input: piles = [30,11,23,4,20], h = 5
// Output: 30

class kokoeatingbanana {
    static int findmax(int p[]){
        int max=p[0];
        for(int i=1;i<p.length;i++){
            if(p[i]>max){
                max=p[i];
            }
        }
        return max;
    }
    static int fun(int a[],int mid){
        int totalhours=0;
        for(int i=0;i<a.length;i++){
            totalhours+=Math.ceil((double)a[i]/(double)mid);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = findmax(piles);
        int mid;
        while(low<=high){
            mid=(low+high)/2;
            int totalhours=fun(piles,mid);
            if(totalhours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}