package Examples.Proxy;

// Proxy
public class ProxyClothingImage implements ClothingImageInterface {
    private final ClothingImage clothingImage;

    public ProxyClothingImage(ClothingImage clothingImage) {
        this.clothingImage = clothingImage;
    }

    @Override
    public void displayImage() {
        System.out.println("Display info: " + clothingImage.fileName + "(" + clothingImage.size + ")");
        System.out.println("User requesting image...");
        clothingImage.displayImage();
        System.out.println();
    }
}
