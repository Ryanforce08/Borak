import math

term = 0.0
summ = 0.0
denom = 1
pi = 0.0

for i in range(10000):
    denom = 2 * i + 1
    term = 1.0 / denom

    if i % 2 == 1:
        term = -term
    summ = summ + term
print ("Pi is approximately:", summ *  4)
