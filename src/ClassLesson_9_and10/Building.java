package ClassLesson_9_and10;

public class Building {

    //1.1 Создать класс Постройка (Building). Поля у класса Постройка: улица, материал стен, год постройки.

    private String street;
    private String wallMaterial;
    private int year;

    public Building(String street, String wallMaterial, int year) {
        this.street = street;
        this.wallMaterial = wallMaterial;
        this.year = year;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getWallMaterial() {
        return wallMaterial;
    }

    public void setWallMaterial(String wallMaterial) {
        this.wallMaterial = wallMaterial;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String info() {
        String info = " Улица = " + street + " Материал стен = " + wallMaterial + " Год постройки здания = " + year;
        return info;
    }
}