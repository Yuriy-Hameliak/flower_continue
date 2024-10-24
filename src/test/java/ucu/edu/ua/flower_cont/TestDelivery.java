package ucu.edu.ua.flower_cont;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ucu.edu.ua.flower_cont.flowers.Flower;
import ucu.edu.ua.flower_cont.flowers.FlowerColor;
import ucu.edu.ua.flower_cont.flowers.FlowerType;
import ucu.edu.ua.flower_cont.delivery.Delivery;
import ucu.edu.ua.flower_cont.delivery.DHLDeliveryStrategy;
import ucu.edu.ua.flower_cont.delivery.PostDeliveryStrategy;

public class TestDelivery {

    private Delivery dhlDelivery;
    private Delivery postDelivery;
    private Flower testFlower;

    @BeforeEach
    public void setUp() {
        dhlDelivery = new DHLDeliveryStrategy();
        postDelivery = new PostDeliveryStrategy();
        testFlower = new Flower();
    }

    @Test
    public void testDHLDelivery() {
        assertEquals(dhlDelivery.deliver(testFlower), testFlower.getDescription() + " is delivered by DHL Delivery");
    }

    @Test
    public void testPostDelivery() {
        assertEquals(postDelivery.deliver(testFlower), testFlower.getDescription() + " is delivered by Post Delivery");
    }

    @Test
    public void testEqualObjects() {
        Flower anotherFlower = new Flower();
        assertEquals(testFlower, anotherFlower);
    }
    
    @Test
    public void testHashCodeConsistency() {
        Flower anotherFlower = new Flower();
        assertEquals(testFlower.hashCode(), anotherFlower.hashCode());
    }
    
    @Test
    public void testDifferentFlowerObjects() {
        Flower differentFlower = new Flower(FlowerType.CACTUS, FlowerColor.GREEN, 7, 15);
        assertNotEquals(testFlower, differentFlower);
    }
}
