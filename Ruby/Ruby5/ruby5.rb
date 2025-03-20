def method1()
    puts "Hello"
    puts "World"
    puts "ruby5"
end

def rand_num(front,back)
    length = (back - front).abs
    sum = 0
    for i in 0..100
        sum += rand(length + 1) + front
    end
    puts "Sum of rand num in range #{front} to #{back} is #{(sum / 100.0)}"
end

method1()

print"\n"

print "Enter a range of numbers (start and end): "
front = gets.chomp.to_i
back = gets.chomp.to_i

rand_num(front,back)
