import random

def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

size = random.randint(1, 1000)
numbers = []
for _ in range(size):
    numbers.append(random.randint(1, 1000))

total = 0
for num in numbers:
    total += num
mean = total / len(numbers)

bubble_sort(numbers)

range = numbers[size - 1] - numbers[0]

mid = len(numbers) // 2
if len(numbers) % 2 == 0:
    median = (numbers[mid - 1] + numbers[mid]) / 2
else:
    median = numbers[mid]

print(f"Mean: {mean}")
print(f"Range: {range}")
print(f"Median: {median}")
