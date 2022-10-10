/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.List;


public class DrivableTrader extends Trader<Drivable> {
    /**
     * Construct a DrivableTrader
     * Same as Trader, except it only takes Drivable objects as inventory, wishlist, etc.
     *
     */
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money){
         super(inventory, wishlist, money);}

    /**
     * Construct a DrivableTrader, giving the
     * given money and an empty wishlist and inventory
     */
    public DrivableTrader(int money) {super(money);}

    /**
     * sellingPrice should be overriden
     * should be equal to:
     *  the object's price + the object's max speed
     */
    @Override
    public int getSellingPrice(DrivableTrader item){
        if (item instanceof Tradable){
            return ((Tradable) item).getPrice() + item.getMaxSpeed();

        }
        return Tradable.MISSING_PRICE;
    }
    }

