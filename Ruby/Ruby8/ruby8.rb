
load 'bubblesort.rb'

arr = []

for i in 0..1000
    arr[i] = rand(1001)
end 
bubble_sort(arr)
puts arr