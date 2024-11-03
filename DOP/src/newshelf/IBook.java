package newshelf;

public sealed interface IBook extends Comparable<IBook> permits Comic,Fiction,TextBook {
    
}
