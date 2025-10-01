package ClassLesson_5_and_6;

public class Task4 {

    public static void main(String[] args) {

        //4. Вывести числа от 100 до 1 через запятую. В конце не должно быть запятой (while)

        int a = 1;
        int b = 100;

        while (b > a) {
            System.out.print(b + ", ");
            b -= 1;
        }
        System.out.println("1");


        System.out.println("************************************************");

        int c = 100;
        do {
            System.out.print(c);
            if (c > a) {
                System.out.print(", ");
            }
            c--;
        } while (c >= a);
    }
}