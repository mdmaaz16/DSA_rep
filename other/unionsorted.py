# def union(l1,l2):
#     i = j = 0
#     while i < (len(l1)) and j < (len(l2)):
#         if l1[i] < l2[j]:
#             print(l1[i],end=" ")
#             i += 1
#         elif l1[i] > l2[j]:
#             print(l2[j],end=" ")
#             j += 1
#         else:
#             print(l1[i],end=" ")
#             i += 1
#             j += 1
#     while i < len(l1):
#         print(l1[i],end=" ")
#         i += 1                
#     while j < len(l2):
#         print(l2[j],end=" ")
#         j += 1    

# l1 = [1,2,4,6,8]
# l2 = [1,2,3,5,7,9,10]
# union(l1,l2)

#union of duplicate elements

def findindex(arr , x):
    while x < len(arr) - 1 and arr[x] == arr[x+1]:
        x += 1
    return x + 1    

def printUnion(a,b):
    i = j = 0
    while i < len(a) and j < len(b):
        if a[i] < b[j]:
            print(a[i],end=" ")
            i = findindex(a,i)
        elif a[i] > b[j]:
            print(b[j],end=" ")
            j = findindex(b , j)
        else:
            print(a[i],end=" ")
            i = findindex(a,i)
            j = findindex(b , j)
    while i < len(a):
        print(a[i],end=" ")
        i = findindex(a,i)        
    while j < len(b):
        print(b[j],end=" ")
        j = findindex(b,j)    



arr1 = [1, 2, 2, 2, 3]
arr2 = [2, 3, 3, 4, 5, 5]
printUnion(arr1, arr2)