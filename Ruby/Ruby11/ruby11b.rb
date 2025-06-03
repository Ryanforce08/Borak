def power(a, b)
    if b == 0
        return 1 
    end
    
    return a * power(a, b - 1)
  end
  
puts power(2, 3)  
puts power(5, 4)  
puts power(3, 2)  