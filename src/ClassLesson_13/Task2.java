package ClassLesson_13;


import java.util.ArrayList;
import java.util.List;

public class Task2 {

    //2. Условие: Создайте ArrayList<String> для хранения списка покупок. Добавь в него 5 товаров.
    //Затем выведите весь список на экран, а после — удалите один товар по названию и снова выведите обновлённый список.

    private static void inputShoppingList(List<String> shoppingList) {
        System.out.println("\nКоллекция товаров:");
        for (String s : shoppingList) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        //List<String> shoppingList = List.of("Хлеб","Сало", "Пиво", "Огурцы", "Лук");

        List<String> shoppingList = new ArrayList<>();

        shoppingList.add("Хлеб");
        shoppingList.add("Сало");
        shoppingList.add("Пиво");
        shoppingList.add("Огурцы");
        shoppingList.add("Лист");

        inputShoppingList(shoppingList);
        shoppingList.remove("Пиво");
        inputShoppingList(shoppingList);
    }
}