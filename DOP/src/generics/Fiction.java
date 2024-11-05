package generics;

public record Fiction<T extends Comparable<T>>(T title, FictionType type) implements IBook<T> {
    @Override
    public T getTitleOrSubject() {
        return title;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof Fiction<T> otherFiction) {
            return this.title.compareTo(otherFiction.title);
        }
        return 0; 
    }
}