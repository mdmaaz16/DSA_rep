#include <iostream>
#include <unordered_map>
#include <vector>

int countSubarraysWithEqual01(int arr[], int n) {
    std::unordered_map<int, int> countMap;
    int countDiff = 0;
    int totalCount = 0;

    for (int i = 0; i < n; i++) {
        // Increment countDiff based on the current element (1 or 0)
        countDiff += (arr[i] == 1) ? 1 : -1;

        // If countDiff is 0, it means we have found a subarray with equal 0s and 1s
        if (countDiff == 0) {
            totalCount++;
        }

        // If countDiff is already seen, add the count to the total
        if (countMap.find(countDiff) != countMap.end()) {
            totalCount += countMap[countDiff];
        }

        // Increment the count for the current countDiff
        countMap[countDiff]++;
    }

    return totalCount;
}

int main() {
    int n = 7;
    int arr[] = {1, 0, 0, 1, 0, 1, 1};

    int result = countSubarraysWithEqual01(arr, n);

    std::cout << "Number of subarrays with equal 0s and 1s: " << result << std::endl;

    return 0;
}
