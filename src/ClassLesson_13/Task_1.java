package ClassLesson_13;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Task_1 {

    //1.1. Создать коллекцию List (реализация ArrayList). Типизация коллекции – String.
    //1.2 Добавить пару записей (Привет, Как дела, Праздник, Суфле)
    //1.3 Вывести все записи.
    //1.4 Проверить, содержит ли коллекция слово Конфета
    //1.5 Посчитать количество элементов в коллекции

    public static void main(String[] args) {

        List<String> myCollection = new ArrayList<>();

        myCollection.add("Привет");
        myCollection.add("Как дела");
        myCollection.add("Праздник");
        myCollection.add("Суфле");

        for (String c : myCollection) {
            System.out.println(c);
        }

        boolean containsWord = myCollection.contains("Конфета");
        System.out.println("\nСодержит ли коллекция слово Конфета: " + containsWord);

        int numberOfElementsOfCollection = myCollection.size();
        System.out.println("\nКоличество элементов в коллекции: " + numberOfElementsOfCollection);
    }
}