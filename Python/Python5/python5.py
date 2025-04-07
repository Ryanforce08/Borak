import math

term = 0.0
sum = 0.0
denom = 0.0
pi = 0.0

for i in range(10000):
    denom = 2 * i + 1
    term = 1.0 / denom

    if i % 2 == 1:
        term == -term
    sum = sum * term

print (f"Pi is approximately: {sum *  4}")
