load 'bubblesort.rb'

arr = []

for i in 0..10
    arr[i] = rand(10)
end 
bubble_sort(arr)

length = arr.length
count1 = 1 
count2 = 1

for i in 0...(length -1)
    if arr[i] == arr[i + 1]
        count1 += 1
    else
        count1 = 1
    end
    if count2 < count1
        count2 += 1
    end
end
mode = []
count1 = 1
for i in 0...(length - 1)
    if arr[i] == arr[i + 1]
        count1 += 1
    else
        count1 = 1
    end
    if count2 == count1
        mode << arr[i]
    end
end
print arr
puts
print mode