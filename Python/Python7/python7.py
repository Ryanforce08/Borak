import random

guesses = 0
correct = False
answer = random.randint(1,100)
while guesses < 7:
    guess = int(input("Guess number Between 1 and 100 inclusive: "))
    guesses += 1
    if guess == answer:
        correct = True
        break
    elif guess < answer:
        print("Higher")
    else:
        print("lower")
if correct:
    print("Won in", guesses, "guesses")
else:
    print("You lose")
