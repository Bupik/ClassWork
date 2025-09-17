package ClassLesson_3_and_4;

import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {

//        2. Ввести числа a и b с консоли. Если a>b и b не равно 0-вывести результат деления a на b.
//           Иначе если a не равно 0, вывести b/a, Иначе вывести сумму чисел a и b.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();

        if (a > b & b != 0) {
            System.out.println(a / b);
        } else if (a != 0) {
            System.out.println(b / a);
        } else {
            System.out.println(a + b);
        }
    }
}