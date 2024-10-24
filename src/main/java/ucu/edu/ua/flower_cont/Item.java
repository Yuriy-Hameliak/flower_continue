package ucu.edu.ua.flower_cont;
import lombok.Getter;
@Getter
public abstract class Item {
    String description;
    public abstract double price();
}
