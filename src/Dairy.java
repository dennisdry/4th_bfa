public class Dairy extends Product {
    private int expirationMonth;
    private int expirationDay;

    public Dairy(String name, int quantity, int... expiration) {
        super(name, quantity);
        expirationDay = expiration[0];
        expirationMonth = expiration[1];

    }

}