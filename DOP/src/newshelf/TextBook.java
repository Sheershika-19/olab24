package newshelf;

public record TextBook(String subject) implements IBook {
    @Override
    public int compareTo(IBook other) {
        if (other instanceof TextBook textBook) {
            return this.subject.compareTo(textBook.subject);
        }
        return 0;
    }
}
