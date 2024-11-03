package generics;

public class TextBook<T> implements IBook<T> {
    private final String subject;

    public TextBook(String subject) {
        this.subject = subject;
    }

    @Override
    public T getAgeorTitle() {
        return (T) (subject);
    }
}
