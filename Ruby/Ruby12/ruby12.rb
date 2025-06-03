print "enter string: "
input = gets.chomp
a = input.split("o")

a.each do |x|
  x.reverse!
end

print a
puts
