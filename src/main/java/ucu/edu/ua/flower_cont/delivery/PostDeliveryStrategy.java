package ucu.edu.ua.flower_cont.delivery;

import ucu.edu.ua.flower_cont.Item;

public class PostDeliveryStrategy implements Delivery{
    public String deliver(Item item){
        return item.getDescription() + " is delivered by Post Delivery";
    }
}
