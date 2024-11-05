package generics;

public record Comic<T extends Comparable<T>>(T title, int ageOfMainCharacter) implements IBook<T> {
    @Override
    public T getTitleOrSubject() {
        return title;
    }

    @Override
    public int compareTo(IBook<T> other) {
        if (other instanceof Comic<T> otherComic) {
            return this.title.compareTo(otherComic.title);
        }
        return 0; 
    }
}
