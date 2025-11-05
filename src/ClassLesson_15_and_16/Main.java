package ClassLesson_15_and_16;

import ClassLesson_15_and_16.exeption.NotCorrectPasswordException;
import ClassLesson_15_and_16.exeption.UserNotFoundException;
import ClassLesson_15_and_16.service.UserService;

public class Main {

    public void authentification () {

        try{
            UserService userService = new UserService();
            userService.authentificate("anna1", "pass2");
        } catch (UserNotFoundException user) {
            System.out.println("Ошибка: " + user.getMessage());
        } catch (NotCorrectPasswordException password) {
            System.out.println("Ошибка: " + password.getMessage());
        }
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.authentification();
    }
}
