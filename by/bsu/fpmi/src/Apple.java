import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 07.09.13
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public class Apple {
    private final int MAX_SEEDS_COUNT = 5;
    private int seeds;

    public Apple() {
        Random random = new Random();

        this.setSeeds(random.nextInt(MAX_SEEDS_COUNT));
    }

    public Apple(int seeds) {
        this.seeds = seeds;
    }

    public int getSeeds() {
        return seeds;
    }

    public void setSeeds(int seeds) {
        this.seeds = seeds;
    }
}
