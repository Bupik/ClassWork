package ClassLesson_11;

public class Coffemachine implements Electronic_Devices {

    //3. Создать класс Кофемашина. Поля наименование. Список функционала.
    //Стоимость, Boolean isOn (включен) Класс кофемашина имплементирует интерфейс Электроприборы.
    //Переопределите метод ворк так, чтобы методы выводил «Кофемашина варит кофе».

    private String name;
    private String functions;
    private int price;
    private boolean isOn;

    public Coffemachine(String name, String functions, int price, boolean isOn) {
        this.name = name;
        this.functions = functions;
        this.price = price;
        this.isOn = isOn;
    }

    @Override
    public void work() {
        System.out.println("Кофемашина " + name + " варит кофе");
        ;
    }

    public void start() {
        isOn = true;
        System.out.println("Кофемашина включена, isOn = " + isOn);
    }
}