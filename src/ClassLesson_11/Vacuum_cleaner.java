package ClassLesson_11;

public class Vacuum_cleaner implements Electronic_Devices {

    //6. Создать класс Пылесос. Поля наименование, бренд, стоимость, Boolean isOn.
    //Класс Пылесос имплементирует интерфейс Электроприборы.
    // Переопределите метод ворк так, чтобы метод выводил «Пылесос убирает».

    private String name;
    private String brand;
    private int price;
    private boolean isOn;

    public Vacuum_cleaner(String name, String brand, int price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Пылесос " + name + " убирает");
        ;
    }
}