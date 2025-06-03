num1 = int(input("enter a number: "))
num2 = int(input("enter a number: "))
str1 = str(input("enter a str: "))

if num1 == 3:
    print("num one correct")
    
if num2 == 3:
    print("num two correct")
else:
    print("num two incorrect")
    
if num1 + num2 == 6:
    print("sum is 6")
elif str1 == "hello":
    print("greetings")
else:  
    print("not correct")
