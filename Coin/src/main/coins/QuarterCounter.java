package coins;

/**
 * QuarterCounter acts as an observer to display the number of quarters.
 * @author GroupB
 * @version 1.0
 */
public class QuarterCounter implements Observer {
    private Coin.CoinCounter coinCounter;

    /**
     * Constructor for QuarterCounter.
     * Registers this object as an observer of the given CoinCounter.
     *
     * @param coinCounter The CoinCounter to observe.
     */
    public QuarterCounter(Coin.CoinCounter coinCounter) {
        this.coinCounter = coinCounter;
        this.coinCounter.addObserver(this);
    }

    /**
     * Called when the CoinCounter updates.
     * Displays the number of quarters.
     */
    @Override
    public void update() {
        System.out.println("Quarter Count: " + coinCounter.getQuarterCount());
    }
}
