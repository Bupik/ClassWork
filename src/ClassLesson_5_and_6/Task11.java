package ClassLesson_5_and_6;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        //11. Ввести число с консоли, которое не заканчивается на 0. Вывести среднее значение всех цифр в числе. Использовать оператор %.(цикл while)

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите число, которое не заканчивается на 0");
        number = scanner.nextInt();

        if (number % 10 == 0) {
            System.out.println("Число заканчивается на 0. Введите другое число");
            number = scanner.nextInt();
        }

        int sum = 0;
        int count = 0;
        int temp = number;

        // Подсчёт суммы и количества цифр
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            count++;
            temp /= 10;
        }

        double average = (double) sum / count;
        System.out.println("Среднее значение цифр числа " + number + " = " + average);
        {

        }
    }
}