package ClassLesson_12;

public class Student extends Person {

    //2. Создать класс Студент. Поля факультет

    private String faculty;

    public Student(String name, String surname, String faculty) {
        super(name, surname);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}