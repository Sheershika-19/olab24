package newshelf;

public record Comic(String title, int ageOfMainCharacter) implements IBook {

    @Override
    public int compareTo(IBook other) {
        //if returned value is other than 0 then objects are not equal
        if (other instanceof Comic comic) {
            int titleComparison = this.title.compareTo(comic.title);
            if (titleComparison != 0) {
                return titleComparison; 
            }
            return Integer.compare(this.ageOfMainCharacter, comic.ageOfMainCharacter);
        }
        return -1;
    }
}
