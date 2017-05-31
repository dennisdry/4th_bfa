
public class Shovel extends Product {
    public enum ShovelMaterial{
        aluminium, steel, plastic,
    }

    public enum ShovelSize{
        small, normal, big
    }

    ShovelMaterial material;
    ShovelSize size;


    public Shovel(String name, int quantity,  ShovelMaterial material, ShovelSize size) {
        super(name, quantity);
        this.material = material;
        this.size = size;
    }
}
