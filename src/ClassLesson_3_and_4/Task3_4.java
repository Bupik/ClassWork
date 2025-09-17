package ClassLesson_3_and_4;

import java.util.Scanner;

public class Task3_4 {

    public static void main(String[] args) {

        //* 4. Введите x,y,z. К числу x прибавьте y, число y умножьте на z. Используйте операции присваивания.
        // * Результат выведите в косноль

        Scanner in = new Scanner(System.in);
        System.out.println("Введите x");
        int x = in.nextInt();
        System.out.println("Введите y");
        int y = in.nextInt();
        System.out.println("Введите z");
        int z = in.nextInt();

        x += y;
        y *= z;
        System.out.println("x = " + x + " and y = " + y);
    }
}