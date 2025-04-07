
input = 8
num = 2
inputstr = "b"

if (input == 8)
    puts "Correct"
end

if (input * num == 16)
	puts "correct"
else
    puts "wrong"
end

if (input * num == 16)
	puts "correct"
elsif (input * 3 == 32)
    puts "close"
else
    puts "wrong"
end

unless (inputstr.eql? "b")
    puts "correct"
else
    puts "wrong"
end

    