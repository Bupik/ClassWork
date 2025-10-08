package ClassLesson_7_and_8;

public class Strings {

    //1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    //2. Распечатать последний символ строки. Используем метод String.charAt().
    //3. Проверить, заканчивается ли ваша строка подстрокой “java!”. Используем метод String.endsWith().
    //10. Вырезать строку Java c помощью метода String.substring().

    String str = "I like Java!!!";

    public static void main(String[] args) {

        String str = "I like Java!!!";
        int length = str.length();
        char lastChar = str.charAt(length - 1);
        System.out.println("Последний элемент = " + lastChar);

        System.out.println("********************");

        //-------------------------------------------------------------------------------------

        boolean isTrue = str.endsWith("java!");
        System.out.println("Строка заканчивается подстрокой *java!* ?" + isTrue);

        System.out.println("********************");

        //-------------------------------------------------------------------------------------

        String resultStr = str.substring(7, 11);
        System.out.println(resultStr);
        int indexStart = str.indexOf("Java");
        String javaWord = "Java";
        String finalStr = str.substring(indexStart, indexStart + javaWord.length());
    }
}