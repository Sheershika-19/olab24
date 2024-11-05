package generics;

public record TextBook<T extends Comparable<T>>(T subject) implements IBook<T> {
    @Override
    public T getTitleOrSubject() {
        return subject;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof TextBook<T> otherTextBook) {
            return this.subject.compareTo(otherTextBook.subject);
        }
        return 0; 
    }
}
