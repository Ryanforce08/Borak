
load 'InsertionSort.rb'

arr = []

for i in 0...100
    arr[i] = rand(1001)
end 
insertionSort(arr)
print arr
puts