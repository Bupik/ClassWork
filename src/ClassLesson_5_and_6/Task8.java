package ClassLesson_5_and_6;

public class Task8 {

    public static void main(String[] args) {

        //8. Создать массив из чисел. Вывести макс и мин число.

        int[] array = {2, 5, 8, 10};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Минимальный элемент массива = " + min);
        System.out.println("Максимальный элемент массива = " + max);
    }
}