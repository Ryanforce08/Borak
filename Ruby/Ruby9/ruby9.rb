arr = []

for i in 0..1000
    arr[i] = rand(1001)
end 
bubble_sort(arr)

print arr.length