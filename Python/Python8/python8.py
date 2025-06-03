guesses = 1
low = 1
high = 100

correct = False


while guesses <= 7 :
    guess = (high + low) // 2 
    print("My guess is", guess)
    
    answer = input("higher, lower, or correct? ")
    

    if answer.startswith("c"):
        correct = True
        print("Won in", guesses, "guesses!")
        break
    elif answer.startswith("h"):
        low = guess + 1
        guesses += 1
    elif answer.startswith("l"):
        high = guess - 1
        guesses += 1
if not correct:
    print("you messed up")


