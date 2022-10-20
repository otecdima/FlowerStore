package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StoreTest {
    private static final double SEPAL_LENGTH = 3.5;
    private static final double PRICE = 50;
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
    }

    @Test
    public void testPrice() {
        Flower newFlower = new Flower(SEPAL_LENGTH, FlowerColor.RED,
                PRICE, FlowerType.ROSE);
        double sepalFlower = newFlower.getSepalLength();
        store.addFlower(newFlower);
        double sepal = (store.search(newFlower)).getSepalLength();
        Assertions.assertEquals(sepalFlower, sepal);
    }
}