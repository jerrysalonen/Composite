package composite;

/**
 * @author Jerry Salonen
 */
public class ComputerPartFactory1 extends AbstractFactory {

    public ComputerPart create(String partType) {
        if ("Motherboard".equalsIgnoreCase(partType)) {
            return new Motherboard(800);
        } else if ("Case".equalsIgnoreCase(partType)) {
            return new Case(300);
        } else if ("Connector".equalsIgnoreCase(partType)) {
            return new Connector(100);
        } else if ("PowerSupply".equalsIgnoreCase(partType)) {
            return new PowerSupply(200);
        } else if ("VideoCard".equalsIgnoreCase(partType)) {
            return new VideoCard(1000);
        } else if ("Processor".equalsIgnoreCase(partType)) {
            return new Processor(800);
        } else if ("RAMComb".equalsIgnoreCase(partType)) {
            return new RAMComb(600);
        }

        return null;
    }

}
