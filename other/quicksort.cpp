//{ Driver Code Starts
#include <stdio.h>
#include <bits/stdc++.h>
using namespace std;

/* Function to print an array */
void printArray(int arr[], int size)
{
    int i;
    for (i=0; i < size; i++)
        printf("%d ", arr[i]);
    printf("\n");
}

// } Driver Code Ends
class Solution
{
    public:
    //Function to sort an array using quick sort algorithm.
    void quickSort(int arr[], int low, int high)
    {
        // code here
        if(low<high)
        {
            int parindex = partition(arr,low,high);
            quickSort(arr,low,parindex-1);
            quickSort(arr,parindex+1,high);
        }
    }
    
    public:
    int partition (int arr[], int low, int high)
    {
       // Your code here
       int i,j,pivot;
       i = low;
       pivot = arr[low];
       j = high;
       while(i<j)
       {
           while(arr[i] <= pivot && i<=high-1)
           {
               i++;
           }
           while(arr[j] > arr[pivot] && j>=low-1)
           {
               j--;
           }
           if(i<j)
           {
               int temp=arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
           }
       }
       int temp = arr[low];
       arr[low] = arr[j];
       arr[j] = temp;
       //swap(arr[low],arr[j]);
       return j;
    }
};


//{ Driver Code Starts.
int main()
{
    int arr[1000],n,T,i;
    scanf("%d",&T);
    while(T--){
    scanf("%d",&n);
    for(i=0;i<n;i++)
      scanf("%d",&arr[i]);
      Solution ob;
    ob.quickSort(arr, 0, n-1);
    printArray(arr, n);
    }
    return 0;
}
// } Driver Code Ends
