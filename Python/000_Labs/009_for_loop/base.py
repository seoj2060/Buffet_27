length = int(input("Please enter line length: "))
whichline = input("Do you want a horizontal or vertical line? ")

if whichline == "horizontal":
    for x in range(0, length):
        print("*", end="")

elif whichline == "vertical":
    for x in range(0, length):
        print("*")