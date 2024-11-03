package newshelf;

import oldshelf.Book;

public class NewSelection {

    public static String getAgeOrTitle(Object o) {
      /* 
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

        type switches
        return switch (o) {
            case Comic comic when !comic.title().isEmpty() -> comic.title();
            case Fiction fiction when !fiction.name().isEmpty() -> fiction.name();
            case TextBook textBook when !textBook.subject().isEmpty() -> textBook.subject();
            case Book book -> "Unknown Book Type";
            default -> "";
        };*/

        //Record patterns with type switches
        return switch (o) {
            case Comic(String title, int ageOfMainCharacter) when !title.isEmpty() -> title;
            case Fiction(String name, FictionType type) when !name.isEmpty() -> name;
            case TextBook(String subject) when !subject.isEmpty() -> subject;
            case Book book -> "Unknown Book Type";
            default -> "";
        };
    }

    public static void main(String[] args) {

        Comic comic = new Comic("Spider man", 21);
        Fiction fiction = new Fiction("Alice story", FictionType.Tragedy);
        TextBook textBook = new TextBook("Physics");

        System.out.println(getAgeOrTitle(comic));
        System.out.println(getAgeOrTitle(fiction));
        System.out.println(getAgeOrTitle(textBook));

        //if returned value is other than 0 then objects are not equal

        Comic comic2=new Comic("Super man",20);
        System.out.println(comic.compareTo(comic2));
        Fiction fiction2=new Fiction("Alice story", FictionType.Tragedy);
        System.out.println(fiction.compareTo(fiction2));
        TextBook tb2=new TextBook("Maths");
        System.out.println(textBook.compareTo(tb2));
    }
}
