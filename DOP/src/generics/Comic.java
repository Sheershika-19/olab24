package generics;

public final class Comic<T> implements IBook<T> {
    private final String title;
    private final int ageOfMainCharacter;

    public Comic(String title, int ageOfMainCharacter) {
        this.title = title;
        this.ageOfMainCharacter = ageOfMainCharacter;
    }

    @Override
    public T getAgeorTitle() {
        return (T) title;  
    }
}
