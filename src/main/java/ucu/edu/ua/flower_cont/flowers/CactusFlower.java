package ucu.edu.ua.flower_cont.flowers;

public class CactusFlower extends Flower {
    public CactusFlower() {
        super();
        this.setFlowerType(FlowerType.CACTUS);
    }
    public CactusFlower(FlowerType flowerType,
    FlowerColor color, double sepalLength, double price) {
        super(FlowerType.CACTUS, color, sepalLength, price);
    }
}
