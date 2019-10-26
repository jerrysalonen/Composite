package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry Salonen
 */
public class Motherboard implements ComputerPart {
    private int prize;
    private String name;

    private List<ComputerPart> childParts;

    public Motherboard(int prize) {
        this.prize = prize;
        this.name = "Emolevy";
        this.childParts = new ArrayList<>();
    }

    public void addPart(ComputerPart part) {
        childParts.add(part);
    }

    public void deletePart(ComputerPart part) {
        childParts.remove(part);
    }

    private int calculatePrize() {
        int tempPrize = this.prize;
        for (ComputerPart part : childParts) {
            tempPrize += part.prize();
        }
        return tempPrize;
    }

    public void listItems() {
        System.out.println("\t" + this.name + ", " + this.prize + "€");
        for (ComputerPart part : childParts) {
            System.out.println("\t" + part.name() + ", " + part.prize() + "€");
        }
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public int prize() {
        return calculatePrize();
    }
}
