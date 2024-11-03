package newshelf;

public record Fiction(String name,FictionType type) implements IBook {
    @Override
    public int compareTo(IBook other) {
        if (other instanceof Fiction fiction) {
            return this.name.compareTo(fiction.name);
        }
        return 0;
    }
}