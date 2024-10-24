package ucu.edu.ua.flower_cont.decorators;
import lombok.*;
import ucu.edu.ua.flower_cont.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class BasketDecorator extends ItemDecorator{
    private Item item;
    public BasketDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with basket decorator";
    }
    public double price(){
        return 4 + getItem().price();
    }
}
