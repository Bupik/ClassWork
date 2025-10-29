package ClassLesson_13.Task_3;

import java.util.ArrayList;
import java.util.List;

public class Task_3 {

    //3.1. Создайте 3 книги. И добавьте эти книги в коллекцию. Используйте метод List.of();
    //3.2 Переоперделите метод equals на книгах так, чтобы он всегда возвращал false
    //3.3. Удалите 1 книгу из коллекции. Выведите все книги и проанализируйте результат.

    public static void main(String[] args) {

        Book book1 = new Book("Му-Му", "Тургенев");
        Book book2 = new Book("Грозовой перевал", "Эмили Бронте");
        Book book3 = new Book("Война и мир", "Лев Толстой");

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Список книг");
        for (Book book : books) {
            System.out.println(book);
        }

        books.remove(book1);

        System.out.println("\nСписок книг после удаления");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}