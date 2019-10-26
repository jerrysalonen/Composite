package composite;

/**
 * @author Jerry Salonen
 */
public interface ComputerPart {
    String name();
    int prize();
    default void addPart(ComputerPart part) {}
    default void deletePart(ComputerPart part) {}
    default void listItems() {}
}
