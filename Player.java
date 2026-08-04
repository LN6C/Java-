import java.util.Random;

public class Player {
    private String name;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int fist(){
        Random r = new Random();
        return r.nextInt(3);
    }
}
