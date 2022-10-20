package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testPrice() {
        Flower new_flower = new Flower(3.5, FlowerColor.RED, 50, FlowerType.ROSE);
        double sepal_flower = new_flower.getSepalLength();
        store.addFlower(new_flower);
        double sepal = (store.search(new_flower)).getSepalLength();
        Assertions.assertEquals(sepal_flower, sepal);
    }
}