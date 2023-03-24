package prak19.Student;
public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Empty string not allowed");
    }
}
