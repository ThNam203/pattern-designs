package Examples.Proxy;

public class ClothingImage {
    public final String fileName;
    public final String size;

    public ClothingImage(String fileName, String size) {
        this.fileName = fileName;
        this.size = size;
    }

    public void displayImage() {
        System.out.println("Display image: " + fileName + "(" + this.size + ")");
    }
}
