package ClassLesson_5_and_6;

public class Task7 {

    public static void main(String[] args) {

        //7. Вывести каждый десяток от 1 до 100.

        for (int i = 1; i <= 100; i++) {

            if (i % 10 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}