def subArraySum(arr, n, s): 
        # Write your code here
        start = 0
        end = 0
        current_sum = 0
        while end < n:
            if current_sum == s:
                return [start + 1, end + 1]

            while current_sum > s and start < end:
                current_sum -= arr[start]
                start += 1

            if end < n:
                current_sum += arr[end]

            end += 1 

        # If no sub-array is found, return [-1]
        return [-1]

arr = [1,2,3,7,5]
s=12
n=5
l=subArraySum(arr,n,s)
print(l) 



#gfg
#User function Template for python3

#Function to find a continuous sub-array which adds up to a given number.
class Solution:
    def subArraySum(self,arr, n, s): 
        i, j, curr_sum = 0, 0, arr[0]
        result = []

        while j < n:
            if curr_sum == s:
                result.extend([i + 1, j + 1])
                return result
            elif curr_sum < s:
                j += 1
                if j < n:
                    curr_sum += arr[j]
            else:
                if i < j:
                    curr_sum -= arr[i]
                    i += 1
                else:
                    i += 1
                    j += 1
                    curr_sum = arr[i] if j < n else 0

        result.append(-1)
        return result

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math

def main():
        T=int(input())
        while(T>0):
            
            NS=input().strip().split()
            N=int(NS[0])
            S=int(NS[1])
            
            A=list(map(int,input().split()))
            ob=Solution()
            ans=ob.subArraySum(A, N, S)
            
            for i in ans:
                print(i, end=" ")
                
            print()
            
            T-=1


if __name__ == "__main__":
    main()
# } Driver Code Ends