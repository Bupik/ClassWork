package ClassLesson_9_and10;

public class CivilBuilding extends Building {

    //1.2 Создать класс Гражданские здания (CivilBuilding).
    //Гражданские здания должны наследоваться от класса Постройка.
    //Поля у класса Гражданские здания: назначение (жилье или общественные здания), количество этажей.

    private String purpose;
    private int floors;

    public CivilBuilding(String street, String wallMaterial, int year, String purpose, int floors) {
        super(street, wallMaterial, year);
        this.purpose = purpose;
        this.floors = floors;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}