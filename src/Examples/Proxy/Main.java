package Examples.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClothingItem> clothingItems = new ArrayList<>();
        clothingItems.add(new ClothingItem("tshirt.jpg", "10KB"));
        clothingItems.add(new ClothingItem("jeans.jpg", "25MB"));
        clothingItems.add(new ClothingItem("jacket.jpg", "50TB"));

        for (ClothingItem item : clothingItems) {
            item.displayImage();
        }
    }
}
