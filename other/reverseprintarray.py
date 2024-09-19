def reverse_print(arr, n):
    for i in range(n-1, -1, -1):
        print(arr[i], end=" ")

# Example usage:
arr = [1, 2, 3, 4, 5]
reverse_print(arr, len(arr))