package composite;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = new ComputerPartFactory2();

        List<ComputerPart> parts = new ArrayList<>();
        int prize = 0;

        ComputerPart processor = (ComputerPart) factory.create("Processor");
        ComputerPart RAM = (ComputerPart) factory.create("RAMComb");
        ComputerPart videoCard = (ComputerPart) factory.create("VideoCard");
        ComputerPart motherBoard = (ComputerPart) factory.create("MotherBoard");
        ComputerPart computerCase = (ComputerPart) factory.create("Case");
        ComputerPart connector = (ComputerPart) factory.create("Connector");
        ComputerPart powerSupply = (ComputerPart) factory.create("PowerSupply");

        motherBoard.addPart(processor);
        motherBoard.addPart(connector);

        computerCase.addPart(RAM);
        computerCase.addPart(motherBoard);
        computerCase.addPart(powerSupply);
        computerCase.addPart(videoCard);

        parts.add(computerCase);

        System.out.println("Nämä ovat tietokoneen osat ja hinnat:");

        System.out.println(computerCase.name() + ", " + computerCase.prize() + "€, koostuu osista:");
        computerCase.listItems();

        System.out.println(motherBoard.name() + " koostuu osista:");
        motherBoard.listItems();

        prize = computerCase.prize();

        System.out.println("Kokonaishinta on: " + prize + "€");

    }
}
