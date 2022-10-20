package flower.store;

import java.util.LinkedList;
import java.util.List;

public class Store {
    private List<Flower> flowers;

    public Store() {
        flowers = new LinkedList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public Flower search(Flower searchFlower) {
        for (Flower flower : flowers) {
            if (searchFlower.getFlowerType() != flower.getFlowerType()) {
                continue;
            }
            if (searchFlower.getPrice() != flower.getPrice()) {
                continue;
            }
            if (searchFlower.getSepalLength() != flower.getSepalLength()) {
                continue;
            }
            String color = searchFlower.getColor();
            if ((color != null) && (!color.equals(""))
                    && (!color.equals(flower.getColor()))) {
                continue;
            }
            return flower;
        }
        return null;
    }
}
