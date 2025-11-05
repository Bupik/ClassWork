package ClassLesson_15_and_16;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task_1 {

    //1.	Заполнить HashMap 10 объектами <Integer, String>. Найти строки у которых ключ>5.
    //Если ключ = 0, вывести строки через запятую. Перемножить все ключи, где длина строки>5.

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "banana");
        map.put(3, "apple");
        map.put(4, "pear");
        map.put(5, "orange");
        map.put(6, "pineapple");
        map.put(7, "grapefruit");
        map.put(8, "melon");
        map.put(9, "strawberry");

        System.out.println("Строки с ключом > 5:");

        Set<Integer> keys = map.keySet();
        Integer result = 1;

        for (Integer i : keys) {
            if (i > 5) {
                System.out.println(map.get(i));
            }
            if (i == 0) {
                System.out.println("\nЗначение при ключе 0: " + map.values());
            }
            String clue = map.get(i);
            if(clue.length() > 5) {
                result = i*result;
            }
        }
        System.out.println("\nУмножение всех ключей, где длина строки > 5 = " + result);
    }
}