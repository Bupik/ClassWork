package ClassLesson_12;

//5. Создать класс стол. Этот класс будет состоять из двух дженериков.
//Первый дженерик будет отображать инвентарный номер стола(Integer), второй дженерик будет отображать персонажа, который за ним будет сидеть
//6. Реализовать метод в классе стол, который будет выводить имя персонажа, сидящего за столом.


public class Table<A extends Integer, B extends Person> {

    private A number;
    private B personTable;

    public void printPerson() {
        System.out.println("За столом " + number + " сидит " + personTable.getName());
    }

    public Table(A number, B personTable) {
        this.number = number;
        this.personTable = personTable;
    }
}