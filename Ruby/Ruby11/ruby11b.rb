def power(a, b)
    if b == 0
        return 1 
    end
    if b < 0
        return 1.0 / power(a, -b) 
    end
    return a * power(a, b - 1)
  end
  
puts power(2, 3)  
puts power(5, 4)  
puts power(3, -2)  