import random

amount = int(input("How many random numbers would you like? "))

thislist = []

for i in range(0, amount):
    number = random.randint(1, 10)
    thislist.append(number)

print("Your numbers are:", end=" ")

for i in range(0, amount):
    if i == amount - 1:
        print(thislist[i])
    else:
        print(thislist[i], end=", ")