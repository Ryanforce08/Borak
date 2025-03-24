load 'bubblesort.rb'

arr = []

for i in 0..1000
    arr[i] = rand(1001)
end 
bubble_sort(arr)

length = arr.length
count1 = 1 
count2 = 1

for i in 0..length -1
    if arr[i] == arr[i + 1]
        count1 += 1
    end
    if arr[i] != arr[i + 1]
        count1 += 1
    end
    if count2 > count1
        count2 += 1
    end
end
mode = []
count1 = 0
for i in 0..length - 1
    if arr[i] == arr[i + 1]
        count1 += 1
    end
    if arr[i] != arr[i + 1]
        count1 += 1
    end
    if count2 == count1
        mode << arr[1]
    end
end
print arr
print mode