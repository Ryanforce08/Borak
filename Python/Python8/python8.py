import random

guesses = 0
low = 1
high = 100

correct = False
guess = random.randint(low, high)
print(f"My guess is {guess}")

while not correct:
    answer = input("higher, lower, or correct? ")
    guesses += 1

    if answer.startswith("c"):
        correct = True
    elif answer.startswith("h"):
        low = guess + 1 
    elif answer.startswith("l"):
        high = guess - 1  

    if not correct:
        guess = int(low + (high - low) / 2 ) 
        print(f"My guess is {guess}")

print(f"Won in {guesses} guesses!")
