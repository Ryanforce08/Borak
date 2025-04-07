num = int(input("enter a number: "))
year = int(input("enter a year: "))
name = input("Name: ")

print(f"hello {name}, you are {year} years old and in {year+num} years you will be {year+num+num} years old")

if num%2 == 0:
    print("The number is even")
elif num%2 != 0:
    print("The number is odd")
else:  
    print("The number is not an integer")