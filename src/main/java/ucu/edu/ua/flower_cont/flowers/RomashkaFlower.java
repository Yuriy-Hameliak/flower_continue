package ucu.edu.ua.flower_cont.flowers;

public class RomashkaFlower extends Flower{
    public RomashkaFlower() {
        super();
        this.setFlowerType(FlowerType.CACTUS);
    }
    public RomashkaFlower(FlowerType flowerType,
    FlowerColor color, double sepalLength, double price) {
        super(FlowerType.ROMASHKA, color, sepalLength, price);
    }
}
