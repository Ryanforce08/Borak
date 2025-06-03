load 'bubblesort.rb'

arr = []

for i in 0...1000
    arr[i] = rand(1001)
end 
bubble_sort(arr)

length = arr.length
sum = 0.0

if length % 2 == 0
	puts "median: #{(arr[length / 2 - 1] + arr[length / 2]) / 2.0}"
else
	puts "median: #{arr[length / 2]}"
end

for i in 0..length - 1
    sum += arr[i]
end

puts "mean: #{sum/length}"
puts "range: #{(arr[length -1]-arr[0])}"
    
