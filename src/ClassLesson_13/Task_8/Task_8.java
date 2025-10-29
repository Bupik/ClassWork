package ClassLesson_13.Task_8;

import ClassLesson_13.Task_3.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task_8 {

    //Создайте множество Set<Book> и добавьте в него несколько книг, включая дубликаты (одинаковое название и автор).
    //Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми.
    //Выведи содержимое множества и убедись, что дубликаты не добавляются.

    public static void main(String[] args) {

        ClassLesson_13.Task_3.Book book1 = new ClassLesson_13.Task_3.Book("Му-Му", "Тургенев");
        ClassLesson_13.Task_3.Book book2 = new ClassLesson_13.Task_3.Book("Му-Му", "Тургенев");
        ClassLesson_13.Task_3.Book book3 = new ClassLesson_13.Task_3.Book("Му-Му", "Тургенев");

        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("Список книг");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}