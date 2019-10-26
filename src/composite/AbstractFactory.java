package composite;

/**
 * @author Jerry Salonen
 */
public abstract class AbstractFactory<T> {
    abstract T create(String partType);
}
