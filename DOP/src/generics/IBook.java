package generics;

public sealed interface IBook<T> permits Comic<T>,Fiction<T>,TextBook<T> {
    T getAgeorTitle();
}
