package ClassLesson_9_and10;

public class FlatHouse extends CivilBuilding {

    //1.5 Создать класс Многоквартирный жилой дом. Вопрос: От какого класса должен наследоваться Многоквартирный жилой дом.
    //Поля, которые можно определить в Многоквартирном жилье: количество квартир.

    private int flatNumbers;

    public FlatHouse(String street, String wallMaterial, int year, String purpose, int floors) {
        super(street, wallMaterial, year, purpose, floors);
        this.flatNumbers = flatNumbers;
    }
}