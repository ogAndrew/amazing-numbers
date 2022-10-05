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
        System.out.printf("duck: %b\n", isDuck(num));


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
            return true;
        } else {
           return false;
        }

    }

    private static boolean isDuck(int number) {
        String strNum = String.valueOf(number);

        int i = 0, n = strNum.length();
        while(i < n && strNum.charAt(i) == '0')
            i++;

        while (i < n) {
            if (strNum.charAt(i) == '0') {
                return true;
            }
            i++;
        }

        return false;
    }


}
