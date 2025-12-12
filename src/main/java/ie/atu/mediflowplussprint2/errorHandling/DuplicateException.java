package ie.atu.mediflowplussprint2.errorHandling;

public class DuplicateException extends RuntimeException {
    private String message;
    private String field;
    public DuplicateException(String message, String field) {
        this.field = field;
    }
    public DuplicateException(String message) {
        super(message);
    }
}