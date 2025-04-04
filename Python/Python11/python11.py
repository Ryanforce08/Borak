def recursive_search(arr, key, index=0):
    if index >= len(arr):  
        return False
    if arr[index] == key:  
        return True
    return recursive_search(arr, key, index + 1)  


array = [2, 5, 7, 9, 1, 3]

print(recursive_search(array, 8))
print(recursive_search(array, 7))
