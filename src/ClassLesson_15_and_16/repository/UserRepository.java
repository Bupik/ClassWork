package ClassLesson_15_and_16.repository;

import ClassLesson_15_and_16.exeption.UserNotFoundException;
import ClassLesson_15_and_16.entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    //2. Создать класс UserRepository. Внутри класса создать статическую переменную List<User> users.
    //3. Выполнить инициализацию коллекции в статическом блоке. Создать 5 пользователей и заполнить поля.

    //Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.

    public static List<User> users = new ArrayList<>();

    static {

        User user1 = new User("anna1", "pass1", "Анна", "Петрова");
        User user2 = new User("nik2", "pass2", "Никита", "Кисилёв");
        User user3 = new User("ivan3", "pass3", "Иван", "Иванов");
        User user4 = new User("evg4", "pass4", "Евгений", "Онегин");
        User user5 = new User("kate5", "pass5", "Катерина", "Тихонова");

        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    public User searchUserByLogin(String login) {
        for (User user : users) {
            if (user.getLogin().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь с логином " + login + " не существует");
    }
}
