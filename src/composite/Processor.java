package composite;

/**
 * @author Jerry Salonen
 */
public class Processor implements ComputerPart {
    int prize;
    String name;

    public Processor(int prize) {
        this.prize = prize;
        this.name = "Prosessori";
    }

    public String name() {
        return this.name;
    }

    public int prize() {
        return this.prize;
    }

}
