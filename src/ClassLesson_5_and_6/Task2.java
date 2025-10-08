package ClassLesson_5_and_6;

public class Task2 {

    public static void main(String[] args) {

        //2. Необходимо вывести следующую последовательность цифр: 1 2 4 8 16 32 64 128 256 512

        for (int i = 1; i <= 512; i += i) {

            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;

        while (i <= 512) {
            System.out.print(i + " ");
            i *= 2;

        }
    }
}