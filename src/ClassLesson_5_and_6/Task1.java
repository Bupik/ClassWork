package ClassLesson_5_and_6;

public class Task1 {

    public static void main(String[] args) {

        //1. Необходимо, чтобы программа отображала следующую последовательность чисел: 7 14 21 28 35 42 49 56 63 70 77 84 91 98

        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println();

        int x = 7;

        while (x <= 98) {
            System.out.print(x + " ");
            x += 7;
        }
    }
}