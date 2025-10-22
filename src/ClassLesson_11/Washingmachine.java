package ClassLesson_11;

public class Washingmachine implements Electronic_Devices, KitchenDevices {

    //5. Создать класс Стиральная машина. Поля наименование, бренд, стоимость, Boolean isOn.
    //Класс стиральная машина имплементирует интерфейс Электроприборы.
    //Переопределите метод ворк так, чтобы метод выводил «Стиральная машина стирает».

    private String name;
    private String brand;
    private int price;
    private boolean isOn;

    public Washingmachine(String name, String brand, int price, boolean isOn) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Стиральная машина " + name + " стирает");
    }

    @Override
    public void broke() {
        System.out.println("Стиральная машина " + name + " ломается");
    }
}