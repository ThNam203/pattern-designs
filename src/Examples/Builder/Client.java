package Examples.Builder;

import java.util.Scanner;

public class Client {
    private static final DietBuilder dietBuilder = new DietBuilder();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the Diet builder!");

        while (running) {
            System.out.println("1. Build a new custom diet");
            System.out.println("2. Build Dia Trung Hai diet");
            System.out.println("3. Build DASH diet");
            System.out.println("4. Build vegetarian diet");
            System.out.println("5. View current diet");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    buildDiet();
                    break;
                case 2:
                    DietMenu.buildDTHDiet(dietBuilder);
                    System.out.println("Diet has been successfully built.");
                    break;
                case 3:
                    DietMenu.buildDASHDiet(dietBuilder);
                    System.out.println("Diet has been successfully built.");
                    break;
                case 4:
                    DietMenu.buildVegetarianDiet(dietBuilder);
                    System.out.println("Diet has been successfully built.");
                    break;
                case 5:
                    viewDiet();
                    break;
                case 0:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println();
        }
    }

    private static void buildDiet() {
        dietBuilder.reset();

        System.out.print("Enter protein choice: ");
        String protein = scanner.nextLine();
        if (!protein.isEmpty()) {
            dietBuilder.buildProtein(protein);
        }

        System.out.print("Enter carbohydrate choice: ");
        String carbohydrate = scanner.nextLine();
        if (!carbohydrate.isEmpty()) {
            dietBuilder.buildCarbonHydrate(carbohydrate);
        }

        System.out.print("Enter fruit and vegetables choice: ");
        String fruitsAndVeggies = scanner.nextLine();
        if (!fruitsAndVeggies.isEmpty()) {
            dietBuilder.buildFruitAndVegetables(fruitsAndVeggies);
        }

        System.out.print("Enter drink choice: ");
        String drink = scanner.nextLine();
        if (!drink.isEmpty()) {
            dietBuilder.buildDrink(drink);
        }

        try {
            dietBuilder.build();
            System.out.println("Diet has been successfully built.");
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void viewDiet() {
        try {
            Diet currentDiet = dietBuilder.build();
            System.out.println(currentDiet.getDietDetail());
        } catch (Error e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
