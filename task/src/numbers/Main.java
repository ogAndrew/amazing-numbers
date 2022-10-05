package numbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");

        int num = scanner.nextInt();

        if (num < 1) {
            System.out.println("This number is not natural!");
            return;
        }

        System.out.printf("Properties of %d\n", num);
        System.out.printf("even: %b\n", isEven(num));
        System.out.printf("odd: %b\n", !isEven(num));
        System.out.printf("buzz: %b\n", isBuzz(num));

        isBuzz(num);
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isBuzz(int number) {
        int withoutLast = number / 10;
        int lastDigit = number % 10;
        int testNum = withoutLast - (lastDigit * 2);
        boolean result = testNum % 7 == 0;


        if (result || lastDigit == 7) {
            System.out.println("It is a Buzz number");
            System.out.println("Explanation:");

            if (lastDigit == 7 && result) {
                System.out.printf("%d is divisible by 7 and ends with 7.", number);
            } else if (lastDigit == 7) {
                System.out.printf("%d ends with 7.", number);
            } else {
                System.out.printf("%d is divisible by 7.", number);
            }

        } else {
            System.out.println("It is not a Buzz number");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.", number);
        }


        return result;
    }


}
