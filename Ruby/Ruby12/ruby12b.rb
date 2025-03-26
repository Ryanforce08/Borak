print "Give me a string: "
strInput = gets.chomp.to_s

print "Give me a char: "
charInput = gets.chomp.chr

counter = 0
strInput.each_byte do |x|
    if x.chr == charInput
        counter += 1
    end
end

puts "The letter #{charInput} appears #{counter} times"

