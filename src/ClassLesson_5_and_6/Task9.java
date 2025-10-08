package ClassLesson_5_and_6;

import java.util.Arrays;

public class Task9 {

    public static void main(String[] args) {

        //9. Создать массив чисел от 1 до 100. Вывести полученный массив.

        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }

        System.out.print(Arrays.toString(array) + " ");
    }
}