package pr1.part1;

import java.util.Locale;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 членов гармонического ряда:");
        for (int n = 1; n <= 10; n++) {
            System.out.printf(Locale.US, "%2d: 1/%d = %.6f%n", n, n, 1.0 / n);
        }
    }
}
