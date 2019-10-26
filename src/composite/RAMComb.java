package composite;

/**
 * @author Jerry Salonen
 */
public class RAMComb implements ComputerPart {
    int prize;
    String name;

    public RAMComb(int prize) {
        this.prize = prize;
        this.name = "RAM";
    }

    public String name() {
        return this.name;
    }

    public int prize() {
        return this.prize;
    }

}
