load 'bubblesort.rb'

arr = []

for i in 0..10
    arr[i] = rand(8)
end 
bubble_sort(arr)

length = arr.length
count1 = 1 
count2 = 1

for i in 0...length -1
	if count1 > count2
        count2 += 1
    end
    if arr[i] == arr[i + 1]
        count1 += 1
    end
    if arr[i] != arr[i+1]
        count1 = 1
	end
    
end
mode = []
count1 = 0
for i in 0...length - 1
	if count2 == count1
        mode << arr[i].to_i
    end
    if arr[i] == arr[i + 1]
        count1 += 1
    end
    if arr[i] != arr[i+1]
        count1 = 1
    end
    
end
print arr
puts
print mode
puts