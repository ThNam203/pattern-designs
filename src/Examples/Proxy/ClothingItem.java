package Examples.Proxy;

public class ClothingItem {
    private final ProxyClothingImage imageProxy;

    public ClothingItem(String imageName, String imageSize) {
        ClothingImage clothingImage = new ClothingImage(imageName, imageSize);
        this.imageProxy = new ProxyClothingImage(clothingImage);
    }

    public void displayImage() {
        imageProxy.displayImage();
    }
}
