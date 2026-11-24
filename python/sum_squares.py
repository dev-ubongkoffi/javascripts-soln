# Three-digit numbers start from 100 and end at 999

for number1 in range(1, 10):

    for number2 in range(0, 10):

        for number3 in range(0, 10):

            number = number1 * 100 + number2 * 10 + number3

            result = (number1 * number1) + (number2 * number2) + (number3 * number3)

            if number == result:

                print(number)
