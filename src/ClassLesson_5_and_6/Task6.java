package ClassLesson_5_and_6;

public class Task6 {

    public static void main(String[] args) {

        //6. Вывести только нечётные числа от 1 до 100.

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}