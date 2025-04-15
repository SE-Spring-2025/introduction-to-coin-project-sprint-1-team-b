package coins;

/**
 * Observer interface for implementing the Observer pattern.
 * Classes implementing this interface can observe 
 * changes in observable objects.
 * @author GroupB
 * @version 1.0
 */
public interface Observer {
    /**
     * Called when the observable object updates.
     */
    void update();
}
