package ClassLesson_7_and_8;

public class Main {

    Book book = new Book();

    public static Book[] books() {

        Book book1 = new Book(1, "Колобок", "Русская народная", "Эксмо", 2005, 15, 10);
        Book book2 = new Book(2, "Репка", "Русская народная", "Эксмо", 2010, 10, 10);
        Book book3 = new Book(3, "Теремок", "Русская народная", "Эксмо", 1960, 45, 10);
        Book book4 = new Book(4, "По щучьему велению", "Русская народная", "Эксмо", 1985, 30, 10);
        Book book5 = new Book(5, "Конёк Горбунок", "Русская народная", "Эксмо", 1890, 100, 10);
        Book arrayBooks[] = {book1, book2, book3, book4, book5};
        return arrayBooks;
    }

    public static void main(String[] args) {

        Book book99 = new Book(1, "Иван Царевич и серый волк", "Русская народная", "Эксмо", 2005, 15, 10);
        //book99.changePrice(11);

        // System.out.println(book99.info());

        Book newBooks[] = books();
        Book booksResult[] = book99.findHighestPublishingYear(newBooks, 1990);
        for (Book s : booksResult) {
            System.out.println(s.info());
        }
    }
}