package ClassLesson_9_and10;

public class Main {

    public static void main(String[] args) {

        Fabric fabric1 = new Fabric("Lenina", "Beton", 25, "Stroika", 10, "Cement");
        Fabric fabric2 = new Fabric("Marksa", "Kirpich", 11, "Prom", 10, "Kirpich");

        Village villages = new Village();
        villages.addBuilding(fabric1);
        villages.addBuilding(fabric2);

        villages.info();
    }
}