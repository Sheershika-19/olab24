package generics;

public sealed interface IBook<T> extends Comparable<IBook<T>> permits Comic, Fiction, TextBook {
    T getTitleOrSubject();
}
