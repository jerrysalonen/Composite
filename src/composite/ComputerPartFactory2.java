package composite;

/**
 * @author Jerry Salonen
 */
public class ComputerPartFactory2 extends AbstractFactory {

    public ComputerPart create(String partType) {
        if ("Motherboard".equalsIgnoreCase(partType)) {
            return new Motherboard(400);
        } else if ("Case".equalsIgnoreCase(partType)) {
            return new Case(100);
        } else if ("Connector".equalsIgnoreCase(partType)) {
            return new Connector(30);
        } else if ("PowerSupply".equalsIgnoreCase(partType)) {
            return new PowerSupply(100);
        } else if ("VideoCard".equalsIgnoreCase(partType)) {
            return new VideoCard(600);
        } else if ("Processor".equalsIgnoreCase(partType)) {
            return new Processor(300);
        } else if ("RAMComb".equalsIgnoreCase(partType)) {
            return new RAMComb(100);
        }

        return null;
    }

}
