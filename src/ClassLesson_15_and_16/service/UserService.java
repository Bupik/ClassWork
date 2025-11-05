package ClassLesson_15_and_16.service;

import ClassLesson_15_and_16.exeption.NotCorrectPasswordException;
import ClassLesson_15_and_16.entity.User;
import ClassLesson_15_and_16.repository.UserRepository;

public class UserService {

    //4. Создать класс сервис. Реализовать в этом классе метод аутентификации пользователя (void authenticate (String login, String password).
    //Этот метод должен проверять наличие пользователя в репозитории по логину. Если пользователя нет, то выбрасываем собственное исключение (UserNotFoundException)
    //5. В этом же методе выполнить проверку пароля пользователя, если по логину мы его нашли.
    //Если пароль не совпадает, то выбрасываем собственное исключение NotCorrectPasswordException.

    public User authentificate(String login, String password) {

        UserRepository userRepository = new UserRepository();
        User user = userRepository.searchUserByLogin(login);

        if (user.getPassword().equals(password)) {
            return user;
        }
        throw new NotCorrectPasswordException("Не верный пароль");
    }
}