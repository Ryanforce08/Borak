import math

term = 0.0
sum = 0.0
denom = 0.0
pi = 0.0
i = 0

while (sum *  4) - math.pi > 0.00001:
    denom = 2 * i + 1
    term = 1.0 / denom

    if i % 2 == 1:
        term == -term
    sum = sum * term
    i += 1

print (f"Pi is approximately: {sum *  4}")
print (f"Looped {i} times")
