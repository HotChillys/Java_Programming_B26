package day28_05_24_2022.custom_exceptions;

public class InvalidBrowserTypeException extends RuntimeException{

    public InvalidBrowserTypeException(String message) {
        super(message);
    }
}
// TODO: 2022-05-24