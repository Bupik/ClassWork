package ClassLesson_7_and_8;

public class Book {

// 1 Создать класс Book c полями id (тип int), name (тип String), author (тип String), издательство ( тип String ), Год издания(тип Int), Количество старниц (тип int), цена (double).Инициализацию книги в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
//2 Создать метод, который будет выводить информацию по полям, которые есть в классе, и назвать его info
//3 Создать метод, который будет изменять цену книги (сам метод в качестве параметра будет принимать новую цену)
//4 В классе main создать массив из пяти книг
//5 Создать метод в классе Book, который будет принимать массив книг и возвращать массив книг, у которых год издания ниже переданнго года в методе.

    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int numberOfPages;
    private double price;

    public Book() {
    }

    public Book(int id, String name, String author, String publisher, int yearOfPublishing, int numberOfPages, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public String info() {
        String result = "Id = " + id + " Name =  " + name + " Author =  " + author + " Publisher =  " + publisher + " Year of publishing = " + yearOfPublishing + " Number of pages " + numberOfPages + " Price =  " + price;
        return result;
    }

    public void changePrice(int newPrice) {
        this.price = newPrice;
    }

    public Book[] findHighestPublishingYear(Book[] books, int inputedYearOfPublishing) {

        int count = 0;

        for (Book everyBook : books) {
            if (everyBook.yearOfPublishing < inputedYearOfPublishing) {
                count++;
            }
        }

        Book booksNewArray[] = new Book[count];
        int j = 0;

        for (int i = 0; i < books.length; i++) {

            if (books[i].yearOfPublishing < inputedYearOfPublishing) {
                booksNewArray[j] = books[i];
                j++;
            }
        }
        return booksNewArray;
    }
}