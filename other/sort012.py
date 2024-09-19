def sort012(n,l):
    low = mid = 0
    high = n - 1
    while mid <= high:
        if l[mid] == 0:
            temp = l[low]
            l[low] = l[mid]
            l[mid] = temp
            low += 1
            mid += 1
        elif l[mid] == 1:
            mid += 1
        elif l[mid] == 2:
            temp = l[high]
            l[high] = l[mid]
            l[mid] = temp
            mid += 1
            high -= 1
    print(l)        

l = []
n = int(input())
for i in range(n):
    l.append(int(input()))
sort012(n,l)    