package generics;

public class Generics {
    public static void main(String[] args) {
        IBook<String> comic = new Comic<>("Spider-Man", 16);
        IBook<String> fiction = new Fiction<>("Alice", FictionType.Tragedy);
        IBook<String> textBook = new TextBook<>("Physics");

        System.out.println(comic.getAgeorTitle());
        System.out.println(fiction.getAgeorTitle());
        System.out.println(textBook.getAgeorTitle());
    }
}
