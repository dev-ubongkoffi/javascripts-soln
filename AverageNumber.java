import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Average = sum / count

        int sum = 0;
        int count = 0;
        int num = 0;

        while (num != -1) {

            System.out.print("Enter a number (-1 to stop): ");
            num = input.nextInt();

            if (num != -1) {

                sum = sum + num;
                count = count + 1;

                System.out.println("Average is: " + (double) sum / count);
            }
        }

    }
}
