s = "Hello World"
final = ""
finalr = ""
s.each_byte do |x|
   final += x.chr + x.chr
end
puts final

final.each_byte do |x|
   finalr.insert(0,x.chr)
end
puts finalr

