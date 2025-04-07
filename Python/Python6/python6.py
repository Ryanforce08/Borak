import math
def func1 (x,y):
    return x+y
def func2 (x):
    sum = 0
    for i in range (x+1):
        sum += math.pow(i,2)
    return (sum)
def func3 (x):
    sum = 0
    for i in range (x+1):
        sum += math.pow(i,3)
    return sum


print (f"1 + 2 = {func1(1,2)}")
print (f"sum of i^2 0..5 {func2(5)}")
print (f"sum of i^3 0..5 {func3(5)}")