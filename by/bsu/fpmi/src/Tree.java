import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 07.09.13
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */
public class Tree {
    private final int MAX_APPLES_COUNT = 100000;
    private int amount;
    private Apple[] apples;

    public Tree() {
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Apple[] getApples() {
        return apples;
    }

    public void setApples(Apple[] apples) {
        this.apples = apples;
    }

    public void grow() {
        Random random = new Random();
        setAmount(random.nextInt(MAX_APPLES_COUNT));

        apples = new Apple[getAmount()];
    }
}
