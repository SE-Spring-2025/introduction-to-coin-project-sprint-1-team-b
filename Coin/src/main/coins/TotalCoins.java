package coins;

/**
 * TotalCoins acts as an observer to display the total number of coins.
 * @author GroupB
 * @version 1.0
 */
public class TotalCoins implements Observer {
    private Coin.CoinCounter coinCounter;

    /**
     * Constructor for TotalCoins.
     * Registers this object as an observer of the given CoinCounter.
     * @param coinCounter The CoinCounter to observe.
     */
    public TotalCoins(Coin.CoinCounter coinCounter) {
        this.coinCounter = coinCounter;
        this.coinCounter.addObserver(this);
    }

    /**
     * Called when the CoinCounter updates.
     * Displays the total number of coins.
     */
    @Override
    public void update() {
        System.out.println("Total Coins: " + coinCounter.getTotalCoins());
    }
}
