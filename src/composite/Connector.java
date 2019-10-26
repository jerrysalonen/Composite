package composite;

/**
 * @author Jerry Salonen
 */
public class Connector implements ComputerPart {
    int prize;
    String name;

    public Connector(int prize) {
        this.prize = prize;
        this.name = "Liitin";
    }

    public String name() {
        return this.name;
    }

    public int prize() {
        return this.prize;
    }

}
