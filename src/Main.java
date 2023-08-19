import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите любое целое не отрицательное число: ");
        int input = new Scanner(System.in).nextInt();
        System.out.println(avg(input));
    }

    public static double avg(int num) {
        String numString = String.valueOf(num); // переводим число в строку
        double sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum = sum + Integer.parseInt(String.valueOf(numString.charAt(i))); // находим сумму каждого числа
        }

        return sum / numString.length(); // считаем среднеарифметическую
    }
}
