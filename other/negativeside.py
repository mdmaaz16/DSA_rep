# def reArrange(arr, n): 
#     low,high = 0, n - 1
#     while(low<high): 
#         if(arr[low] > 0): 
#             low += 1
#         elif(arr[high] < 0): 
#             high -= 1
#         else: 
#             arr[low],arr[high] = arr[high],arr[low] 
  
# def displayArray(arr, n): 
  
#     for i in range(n): 
#         print(arr[i],end = " ") 
    
#     print('') 
  
# # driver code 
# # Data 
# arr = [1, 2,  -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2,  1] 
# n = len(arr) 
# reArrange(arr,n) 
# displayArray(arr,n) 

def reArrange(arr, n):
    positive = 0
    for i in range(n):
        if arr[i] > 0:
            arr[i], arr[positive] = arr[positive], arr[i]
            positive += 1

def displayArray(arr, n):
    for i in range(n):
        print(arr[i], end=" ")
    print('')

# driver code
# Data
arr = [1, 2, -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1]
n = len(arr)
reArrange(arr, n)
displayArray(arr, n)
