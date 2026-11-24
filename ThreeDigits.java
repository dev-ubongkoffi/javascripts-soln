public class ThreeDigits {
    public static void main(String[] args) {

        // Three-digit numbers start from 100 and end at 999

        for (int number1 = 1; number1 <= 9; number1++) {

            for (int number2 = 0; number2 <= 9; number2++) {

                for (int number3 = 0; number3 <= 9; number3++) {

                    int number = number1 * 100 + number2 * 10 + number3;

                    int result = (number1 * number1) + (number2 * number2) + (number3 * number3);

                    if (number == result) {

                        System.out.println(number);

                    }
                }
            }
        }
    }
}
