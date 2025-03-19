print "guess a number 0-10: "
input = gets.chomp.to_i
if (input == 8)
    print "Correct"
elsif (input > 8)
    print "To High"
else
    print "To low"
end
print "\nguess a letter: "
inputstr = gets.chomp.to_s
if (inputstr.eql? "b")
    print "correct"
elsif (inputstr.eql? "a")
    print "close"
else
    print "wrong"
end

    