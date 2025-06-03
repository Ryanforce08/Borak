print "Give me a string: "
strInput = gets.chomp.to_s



print "Give me a char: "
charInput = gets.chomp.chr

counter = 0

a = strInput.split("")

a.each do |x|
    if x.chr == charInput
        counter += 1
    end
end

puts "The letter #{charInput} appears #{counter} times"

