import random

i = 10000

sum = 0
min = 10000
max = 1

for _ in range(i):
    rand = random.randint(1, 10000)
    sum += rand
    
    if rand < min:
        min = rand
    if rand > max:
        max = rand

mean = sum / i

range = max - min

print(f"Mean: {mean}")
print(f"Range: {range}")
print(f"Minimum: {min}")
print(f"Maximum: {max}")