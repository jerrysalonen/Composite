package composite;

/**
 * @author Jerry Salonen
 */
public class VideoCard implements ComputerPart {
    int prize;
    String name;

    public VideoCard(int prize) {
        this.prize = prize;
        this.name = "Videokortti";
    }

    public String name() {
        return this.name;
    }

    public int prize() {
        return this.prize;
    }

}
