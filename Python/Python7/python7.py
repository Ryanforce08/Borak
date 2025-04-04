import random

guesses = 0
correct = False
answer = random.randint(1,100)
while not correct:
    guess = int(input("Guess number Between 1 and 100 inclusive: "))
    guesses += 1
    if guess == answer:
        print("correct")
        correct = True
    elif guess < answer:
        print("Higher")
    elif guess > answer:
        print("lower")
    else:
        print("invalid anwser")
print(f"Won in {guesses} guesses")