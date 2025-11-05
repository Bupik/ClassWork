package ClassLesson_15_and_16.exeption;

public class NotCorrectPasswordException extends RuntimeException {

    public NotCorrectPasswordException(String message) {
        super(message);
    }
}