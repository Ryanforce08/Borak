import random

def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                swap = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = swap
    return arr

size = random.randint(1, 1000)
numbers = []
for i in range(size):
    numbers.append(random.randint(1, 1000))

total = 0
for num in numbers:
    total += num
mean = total / len(numbers)

bubble_sort(numbers)

rangee = numbers[size - 1] - numbers[0]

mid = len(numbers) // 2
if len(numbers) % 2 == 0:
    median = (numbers[mid - 1] + numbers[mid]) / 2
else:
    median = numbers[mid]

print("Mean:", mean)
print("Range:", rangee)
print("Median:", median)
print(numbers)
