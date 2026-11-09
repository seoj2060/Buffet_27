number = int(input("Please enter a number: "))
operation = input("Please enter an operation: ")
anothernumber = int(input("Please enter another number: "))

print("")

if operation == "+":
    print(str(number) + " + " + str(anothernumber) + " = " + str(number + anothernumber))
elif operation == "-":
    print(str(number) + " - " + str(anothernumber) + " = " + str(number - anothernumber))
elif operation == "*":
    print(str(number) + " * " + str(anothernumber) + " = " + str(number * anothernumber))
elif operation == "/":
    print(str(number) + " / " + str(anothernumber) + " = " + str(number / anothernumber))
else:
    print("Invalid operation / Please write the correct operation!!😁😁😎😆")
print("")