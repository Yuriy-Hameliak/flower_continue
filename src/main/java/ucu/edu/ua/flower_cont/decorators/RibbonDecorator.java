package ucu.edu.ua.flower_cont.decorators;
import lombok.*;
import ucu.edu.ua.flower_cont.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class RibbonDecorator extends ItemDecorator{
    private Item item;
    public RibbonDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with ribbon decorator";
    }
    public double price(){
        return 40 + getItem().price();
    }
}
