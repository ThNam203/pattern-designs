package Examples.Builder;

public class DietMenu {
    public static Diet buildDTHDiet(DietBuilder builder) {
        builder.reset();

        builder.buildProtein("Thịt cá");
        builder.buildCarbonHydrate("Dầu olive");
        builder.buildFruitAndVegetables("Rau quả tươi");
        builder.buildDrink("Rượu vang đỏ");
        return builder.build();
    }

    public static Diet buildDASHDiet(DietBuilder builder) {
        builder.reset();

        builder.buildProtein("Thịt gà");
        builder.buildCarbonHydrate("Gạo lứt");
        builder.buildFruitAndVegetables("Rau xanh");
        builder.buildDrink("Nước ép trái cây");
        return builder.build();
    }

    public static Diet buildVegetarianDiet(DietBuilder builder) {
        builder.reset();

        builder.buildProtein("Đậu hũ");
        builder.buildCarbonHydrate("Khoai tây");
        builder.buildFruitAndVegetables("Rau củ hỗn hợp");
        builder.buildDrink("Nước lọc");
        return builder.build();
    }
}
