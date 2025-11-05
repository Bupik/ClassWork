package ClassLesson_15_and_16.entity;

public class User {

    //1. Создать класс пользователь. Поля логин, пароль, имя, фамилия.

    private String login;
    private String password;
    private String name;
    private String surname;

    public User(String login, String password, String name, String surname) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + login + ")";
    }
}