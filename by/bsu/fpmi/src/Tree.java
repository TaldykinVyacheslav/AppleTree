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

    public int seedsCount() {
        int result = 0;

        for (int i = 0; i < apples.length; i++) {
            result += apples[i].getSeeds();
        }

        return result;
    }

    public void grow() {
        apples = new Apple[getAmount()];

        for (int i = 0; i < apples.length; i++) {
            apples[i] = new Apple();
        }
    }

    public void shake() {
        int deleteAmount = ((int)Math.rint(Math.random() * getAmount()));
        Apple[] newApples;

        setAmount(getAmount() - deleteAmount);
        newApples = new Apple[getAmount()];
        System.arraycopy(getApples(), 0, newApples, 0, newApples.length);
        setApples(newApples);
    }

    public void blossom() {
        Random random = new Random();
        setAmount(random.nextInt(MAX_APPLES_COUNT));
    }
}
