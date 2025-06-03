from random import randint,shuffle
def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                swap = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = swap
    return arr
    

def find_mode(arr):
    length = len(arr)
    count1 = 1
    count2 = 1
    for i in range(length - 1):  
        if arr[i] == arr[i + 1]:
            count1 += 1
        if not arr[i] == arr[i+1]:
            count1 = 1
        if count1 > count2:
            count2 += 1
        
    mode = []
    count1 = 1
    for i in range(length - 1):
        if arr[i] == arr[i + 1]:
            count1 += 1
        if not arr[i] == arr[i+1]:
            count1 = 1
        if count2 == count1:
            mode.append(arr[i])
    return mode

lst = []
for i in range(10):
    lst.append(randint(0,10))
slist = bubble_sort(lst)
print(slist)
print(find_mode(slist))
