public class Store {

    private Store(){};

    private static Store store = null;

    public static Store getStore() {
        if (store == null) {
            store = new Store();
        }
        return store;
    }
}
