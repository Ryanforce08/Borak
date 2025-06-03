import math

term = 0.0
summ = 0.0
denom = 0.0
pi = 0.0
i = 0

while abs((summ *  4) - math.pi) > 0.00001:
    denom = 2 * i + 1
    term = 1.0 / denom

    if i % 2 == 1:
        term = -term
    summ = summ+ term
    i += 1

print ("Pi is approximately:", summ *  4)
print ("Looped", i, "times")
