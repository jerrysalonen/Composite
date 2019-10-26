package composite;

/**
 * @author Jerry Salonen
 */
public class PowerSupply implements ComputerPart {
    int prize;
    String name;

    public PowerSupply(int prize) {
        this.prize = prize;
        this.name = "Virtalähde";
    }

    public String name() {
        return this.name;
    }

    public int prize() {
        return this.prize;
    }

}
