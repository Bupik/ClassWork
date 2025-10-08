package ClassLesson_5_and_6;

public class Task10 {

    public static void main(String[] args) {

        //10. Сортировать массив чисел. Сортировка пузырьком

        int[] numbers = {45, 12, 78, 34, 23, 89, 5, 67};

        // Пузырьковая сортировка
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // Обмен элементов
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Вывод отсортированного массива
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}