package ClassLesson_3_and_4;

import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {

//        1. Ввести числа a и b с консоли. Если a>b, то вывести разность (a-b) передав ее в новую переменную.
//        Иначе если a=b  вывести сумму этих чисел.
//        Иначе, вывести разность b-a. Результат вычисления передать в новую переменную.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();
        System.out.println("Введите b");
        int b = in.nextInt();

        if (a > b) {
            int c = a - b;
            System.out.println(c);
        } else if (a == b) {
            int d = a + b;
            System.out.println(d);
        } else {
            int i = b - a;
            System.out.println(i);
        }
    }
}