
def func1 (x):
    summ = 0
    for i in range(x+1):
        summ += i
    return summ
def func2 (x):
    summ = 0
    for i in range(x+1):
        summ += i**2
    return summ
def func3 (x):
    summ = 0
    for i in range(x+1):
        summ += i**3
    return summ


print (1,"+", 2,"+.." + str(100), "=", func1(100))
print ("sum of i^"+ str(2), str(0) + ".."+ str(100),"=", func2(100))
print ("sum of i^" + str(3), str(0) + ".." + str(100), "=",func3(100))
