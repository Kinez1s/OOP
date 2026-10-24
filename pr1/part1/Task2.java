package pr1.part1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Введите положительное количество элементов: ");
            size = scanner.nextInt();
        } while (size <= 0);

        int[] numbers = new int[size];
        int index = 0;
        while (index < size) {
            System.out.print("Элемент " + (index + 1) + ": ");
            numbers[index] = scanner.nextInt();
            index++;
        }

        int sum = 0;
        int minimum = numbers[0];
        int maximum = numbers[0];
        index = 0;
        do {
            int number = numbers[index];
            sum += number;
            if (number < minimum) minimum = number;
            if (number > maximum) maximum = number;
            index++;
        } while (index < size);

        System.out.println("Сумма: " + sum);
        System.out.println("Минимум: " + minimum);
        System.out.println("Максимум: " + maximum);
    }
}
