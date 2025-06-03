import random


summ = 0
minn = 10000
maxx = 1

for i in range(10000):
    rand = random.randint(1, 10000)
    summ += rand
    
    if rand < minn:
        minn = rand
    if rand > maxx:
        maxx = rand

mean = summ / i

rangee = maxx - minn

print("Mean:", mean)
print("Range:", rangee)
print("Minimum:", minn)
print("Maximum:", maxx)
