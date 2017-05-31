public class Main {
    public static void main(String[] args) {


        RegularMilk regular1 = new RegularMilk("Regular", 100, 3, 4);
        LongLastingMilk longLasting1 = new LongLastingMilk("LongLasting", 200, 12, 5, 1);

        Store.getStore();
        Shovel shovel1 = new Shovel("coolshovel", 6, Shovel.ShovelMaterial.aluminium, Shovel.ShovelSize.normal);


    }
}
