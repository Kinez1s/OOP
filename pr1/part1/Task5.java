package pr1.part1;

import java.util.Scanner;

public class Task5 {
    public static long factorial(int number) {
        if (number < 0 || number > 20) {
            throw new IllegalArgumentException("Число должно быть от 0 до 20");
        }

        long result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число от 0 до 20: ");
        int number = scanner.nextInt();

        try {
            System.out.println(number + "! = " + factorial(number));
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
