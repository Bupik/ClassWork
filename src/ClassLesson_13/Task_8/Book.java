package ClassLesson_13.Task_8;

import java.util.Objects;

public class Book {

    //8. Условие: Создай класс Book с полями: • String title • String author
    //Переопределите методы equals() и hashCode() так, чтобы книги с одинаковыми значениями title и author считались одинаковыми.
    //Выведи содержимое множества и убедись, что дубликаты не добавляются.

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean equals(Object o) {
        ClassLesson_13.Task_3.Book book = (ClassLesson_13.Task_3.Book) o;

        if(title.equals(book.getTitle())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return author.hashCode() + title.hashCode();
    }

    public String toString() {
        return "Название книги: " + title + " Автор: " +   author;
    }
}