package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private Store store;
    private static final double sepalLength = 3.5;
    private static final double price = 50;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testPrice() {
        Flower newFlower = new Flower(sepalLength, FlowerColor.RED,
                price, FlowerType.ROSE);
        double sepal_Flower = newFlower.getSepalLength();
        store.addFlower(newFlower);
        double sepal = (store.search(newFlower)).getSepalLength();
        Assertions.assertEquals(sepal_Flower, sepal);
    }
}