def isPrime(n)
    if n <= 1
        return false
    end
    for i in 2..Math.sqrt(n).to_i
        if n % i == 0
            return false 
        end
    end
    return true
end

arr = []
i=2
j=0
while j <= 100
    if isPrime(i)
        arr << i
        j += 1
    end
    i+=1
end

print arr
