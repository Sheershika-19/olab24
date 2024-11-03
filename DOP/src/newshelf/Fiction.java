package newshelf;

public record Fiction(String name,FictionType type) implements IBook {
    @Override
    public int compareTo(IBook other) {
        if (other instanceof Fiction fiction) {
            //if returned value is other than 0 then objects are not equal
            int nameComparison = this.name.compareTo(fiction.name);
            if (nameComparison != 0) {
                return nameComparison;
            }
            return this.type.compareTo(fiction.type);
        }
        return -1;
    }
}