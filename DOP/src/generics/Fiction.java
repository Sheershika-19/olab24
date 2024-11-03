package generics;

public final class Fiction<T> implements IBook<T> {
    private final String name;
    private final FictionType type;

    public Fiction(String name, FictionType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public T getAgeorTitle() {
        return (T) name;  
    }
}
