package ClassLesson_11;

public class Main {

    //7. В классе main создать по паре объектов на основании выше созданных классов.
    //Создайте в классе main выставку из электроприборов и продемонстрируйте способности каждого электроприбора
    //9.  В классе main сделать выставку только из Кухонной техники. Продемонстрировать способности всех электроприборов в этой выставке.
    //10. В классе main сделать выставку кофемашин. Продемонстрировать способности всех кофе машин.
    //11. На любой кофемашине вызовете метод start().
    //После этого переопределите метод start так, чтобы этот метод включал прибор (менял значение Boolean isOn на true.) Выведите результат в консоль

    public static void main(String[] args) {

        //Объекты на основании вышесозданных классов
        Coffemachine coffemachine1 = new Coffemachine("Delongi", "Варит кофе", 1500, false);
        Coffemachine coffemachine2 = new Coffemachine("Braun", "Варит не очень вкусный кофе", 70, false);

        Fridge fridge1 = new Fridge("Samsung", "Хранит продукты", 800, false);
        Fridge fridge2 = new Fridge("Bosh", "Хранит продукты не хуже Самсунга", 720, false);

        Vacuum_cleaner vacuum_cleaner1 = new Vacuum_cleaner("Пылесос моющий", "Kirbi", 280, false);
        Vacuum_cleaner vacuum_cleaner2 = new Vacuum_cleaner("Пылесос ручной", "Samsung", 200, false);

        Washingmachine washingmachine1 = new Washingmachine("Стиралка вертикальная", "Hansa", 330, false);
        Washingmachine washingmachine2 = new Washingmachine("Стиралка", "Electrolux", 270, false);

        //Выставка из электроприбров
        Electronic_Devices[] devices = {coffemachine1, coffemachine2, fridge1, fridge2, vacuum_cleaner1, vacuum_cleaner2, washingmachine1, washingmachine2};

        //Продемонстрировать способности каждого электроприбора
        System.out.println("Выставка электронных девайсов");
        for (Electronic_Devices device : devices) {
            device.work();
        }

        System.out.println("**********************************************************************");

        //выставку только из Кухонной техники
        KitchenDevices[] kitchenDevices = {fridge1, fridge2, washingmachine1, washingmachine2};

        //Продемонстрировать спосбоности всех электроприборов.
        System.out.println("Выставка кухонных девайсов");
        for (KitchenDevices kitchenDevice : kitchenDevices) {
            kitchenDevice.broke();
        }

        System.out.println("************************************************************************");

        System.out.println("Выставка кофемашин");
        Coffemachine[] coffemachines = {coffemachine1, coffemachine2};

        for (Coffemachine coffemachine : coffemachines) {
            coffemachine.work();
        }

        System.out.println("***************************************************************************");

        coffemachine1.start();
    }
}