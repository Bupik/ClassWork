package ClassLesson_3_and_4;

import java.util.Scanner;

public class Task4_3 {

    public static void main(String[] args) {

//3. На вход дано число. Определить, делиться ли оно на три. Вывести соответствующий текст.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите a");
        int a = in.nextInt();

        if (a % 3 == 0) {
            System.out.println("Число" + a + " делится на 3");
        } else {
            System.out.println("Число" + a + " НЕ делится на 3");
        }
    }
}
