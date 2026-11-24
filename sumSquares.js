// three digit number can only start from 100 and end with 999

for (let number1 = 1; number1 <= 9; number1++) {

    for (let number2 = 0; number2 <= 9; number2++) {

        for (let number3 = 0; number3 <= 9; number3++) {

            let number = number1 * 100 + number2 * 10 + number3;

            let result = (number1 * number1) + (number2 * number2) + (number3 * number3);

            if (number === result) {

                console.log(number);

            }

        }

    }

}
