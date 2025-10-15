package ClassLesson_9_and10;

public class Fabric extends IndustrialBuilding {

    //1.6 Создать класс фабрика. Вопрос: От какого класса должна наследоваться Фабрика.
    //Поля, которые можно определить в фабрике: количество работников, выпускаемая продукция (запчасти, полиэтилен и т.д.)

    private int workers;
    private String production;

    public Fabric(String street, String wallMaterial, int year, String industry, int workers, String production) {
        super(street, wallMaterial, year, industry);
        this.workers = workers;
        this.production = production;
    }

    public int getWorkers() {
        return workers;
    }

    public String getProduction() {
        return production;
    }

    public void setWorkers(int workers) {
        this.workers = workers;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String info() {
        String info = "Количество работников = " + workers + " Продукция = " + production + " Отрасль = " + super.info();
        return info;
    }
}