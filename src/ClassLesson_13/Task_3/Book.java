package ClassLesson_13.Task_3;

import java.util.List;
import java.util.Objects;

public class Book {

    //3. Условие: Создай класс Book с полями: • String title • String author
    //3.2 Переоперделите метод equals на книгах так, чтобы он всегда возвращал false

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
        Book book = (Book) o;

        if(title.equals(book.getTitle())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    public String toString() {
        return "Название книги: " + title + " Автор: " +   author;
    }
}