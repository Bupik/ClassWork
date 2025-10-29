package ClassLesson_12;

public class Main {

    //7. В классе main Создать три стола, за которыми будут сидеть студент и сотрудник.
    //8. Вывести поочередно  имена персонажей, которые сидят за столом.

    public static void main(String[] args) {

        Student student = new Student("Jhon", "Doe", "Low");
        Employee employee = new Employee("Jim", "Bim", 1500);

        Table<Integer, Person> table1 = new Table(1, student);
        Table<Integer, Person> table2 = new Table(2, employee);

        table1.printPerson();
        table2.printPerson();
    }
}