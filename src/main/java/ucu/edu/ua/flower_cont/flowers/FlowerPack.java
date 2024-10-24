package ucu.edu.ua.flower_cont.flowers;

import lombok.*;
@Data
public class FlowerPack {
    private Flower flower;
    private int quantity;

    public double getPrice() {
        return this.flower.getPrice() * quantity;
    }
}
