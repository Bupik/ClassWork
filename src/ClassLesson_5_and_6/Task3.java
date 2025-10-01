package ClassLesson_5_and_6;

public class Task3 {

    public static void main(String[] args) {

        //3. Написать программу, которая посчитает сумму первых 10 чисел

        int sum = 0;
        int i = 1;

        for (i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Сумма первых десяти чисел методом for = " + sum);

        System.out.println("**********************************");

        while (i <= 10) {
            sum += i;
        }

        System.out.println("Сумма первых десяти чисел методом while= " + sum);
    }
}