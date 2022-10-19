package flower.store;


public class FlowerBucket {
    private int bucketPrice = 0;

    public void add(FlowerPack flowerPack) {
        bucketPrice += flowerPack.getPrice();
    }

    public double getPrice() {
        return bucketPrice;
    }
}