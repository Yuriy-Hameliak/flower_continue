package ucu.edu.ua.flower_cont.flowers;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ucu.edu.ua.flower_cont.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class Flower extends Item{
    public static final double DEFAULT_SEPALLENGHT = 5;
    public static final double DEFAULT_PRICE = 10;
    private double sepalLength;
    private FlowerColor color;
    private double price;
    private FlowerType flowerType;
    public Flower() {
        this.flowerType = FlowerType.CACTUS;
        this.color = FlowerColor.GREEN;
        this.sepalLength = DEFAULT_SEPALLENGHT;
        this.price = DEFAULT_PRICE;
    }

    public Flower(FlowerType flowerType,
    FlowerColor color, double sepalLength, double price) {
        this.flowerType = flowerType;
        this.color = color;
        this.sepalLength = sepalLength;
        this.price = price;
    }
    public String getColor() {
        return color.toString();
    }

    public void setColor(FlowerColor newColor) {
        this.color = newColor;
    }
    public double price(){
        return price;
    }
    public String getDescription(){
        return toString();
    }
}
