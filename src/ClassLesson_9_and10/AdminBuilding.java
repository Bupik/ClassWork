package ClassLesson_9_and10;

public class AdminBuilding extends Building {

    //1.4 Создать класс Административном здании. Административное здание должно наследоваться от Гражданского здания.
    // Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.

    private String adminBuildingPurpose;
    private int people;

    public AdminBuilding(String street, String wallMaterial, int year, String adminBuildingPurpose, int people) {
        super(street, wallMaterial, year);
        this.adminBuildingPurpose = adminBuildingPurpose;
        this.people = people;
    }
}