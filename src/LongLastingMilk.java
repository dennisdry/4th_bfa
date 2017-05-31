public class LongLastingMilk extends Dairy {
    private int expirationYear;

    public LongLastingMilk(String name, int quantity, int... expiration) {
        super(name, quantity, expiration);
        expirationYear = expiration[2];
    }
}
