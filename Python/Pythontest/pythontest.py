import random

def insertionsort(a):
    for i in range(len(a)):
        temp = a[i]
        j = i - 1
        while(j >= 0 and temp < a[j]):
            a[j+1] = a[j]
            j -= 1
        a[j+1] = temp
    return a
def factorial(n):

    if n == 0:
        return 1

    return n * factorial(n - 1)

def Fibonacci(n):
    if n<= 0:
        return n
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return Fibonacci(n-1)+Fibonacci(n-2)

lst = [9,8,7,6,5,4,3,2,1]
s = " final quiiz "

print(s.find("f",4,6))
