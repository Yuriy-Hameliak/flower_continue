package ucu.edu.ua.flower_cont.decorators;
import lombok.*;
import ucu.edu.ua.flower_cont.Item;
@Data
@EqualsAndHashCode(callSuper = false)
public class PaperDecorator extends ItemDecorator{
    private Item item;
    public PaperDecorator(Item item){
        this.item=item;
    }
    public String getDescription(){
        return item.getDescription()+" with paper decorator";
    }
    public double price(){
        return 13 + getItem().price();
    }
}
