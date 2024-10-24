package ucu.edu.ua.flower_cont.flowers;

import java.util.ArrayList;
import java.util.List;

import lombok.*;
import ucu.edu.ua.flower_cont.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class FlowerBucket extends Item{
    private List<FlowerPack> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }
    public FlowerBucket(List<FlowerPack> flowers) {
        this.flowers = flowers;
    }

    public void add(FlowerPack flowerPack) {
        flowers.add(flowerPack);
    }
    public void addFlowers(List<FlowerPack> packList){
        for (int i=0; i< packList.size(); i++){
            flowers.add(packList.get(i));
        }
    }
    public double price() {
        double price = 0;
        for (FlowerPack flowerPack : flowers) {
            price += flowerPack.getPrice();
        }
        return price;
    }
    public List<FlowerType> getFlowerTypes() {
        List<FlowerType> flowerTypes = new ArrayList<>();
        for (FlowerPack flowerPack : flowers) {
            flowerTypes.add(flowerPack.getFlower().getFlowerType());
        }
        return flowerTypes;
    }
    public List<FlowerPack> search(List<FlowerType> flowerTypes) {
        List<FlowerPack> returnPacks = new ArrayList<>();
        for (FlowerPack flowerPack : flowers) {
            if (flowerTypes.contains(flowerPack.getFlower().getFlowerType())) {
                returnPacks.add(flowerPack);
            }
        }
        return returnPacks;
    };
}
