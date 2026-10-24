package pr1.part1;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {7, 12, 3, 18, 10};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
