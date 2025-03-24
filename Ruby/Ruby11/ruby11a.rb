def fibonacci(n)
    if n <= 1
        return n 
    end
    return fibonacci(n - 1) + fibonacci(n - 2)
end

def factorial(n)
    if n <= 1
        return 1 
    end
    return n * factorial(n - 1)
end
  
puts "Fibonacci of 6: #{fibonacci(6)}" 
puts "Factorial of 5: #{factorial(5)}"