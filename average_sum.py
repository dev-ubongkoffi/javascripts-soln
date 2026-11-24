# Average = sum / count

sum = 0
count = 0
num = 0

while num != -1:

    num = int(input("Enter a number (-1 to stop): "))

    if num != -1:
        sum = sum + num
        count = count + 1

        print("Average is:", sum / count)
