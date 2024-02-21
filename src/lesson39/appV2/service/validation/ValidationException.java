package lesson39.appV2.service.validation;

public class ValidationException extends RuntimeException{
    public ValidationException(String message) {
        super(message);
    }
}
