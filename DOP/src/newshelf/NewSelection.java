package newshelf;

public class NewSelection {

    public static String getAgeOrTitle(Object o) {

        if (o instanceof IBook) {
            if (o instanceof Comic comic) {
                return comic.title();
            } else if (o instanceof Fiction fiction) {
                return fiction.name();
            } else if (o instanceof TextBook textBook) {
                return textBook.subject();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        Comic comic = new Comic("Spider man");
        Fiction fiction = new Fiction("Alice story", FictionType.Tragedy);
        TextBook textBook = new TextBook("Physics");

        System.out.println(getAgeOrTitle(comic));
        System.out.println(getAgeOrTitle(fiction));
        System.out.println(getAgeOrTitle(textBook));

    }
}
