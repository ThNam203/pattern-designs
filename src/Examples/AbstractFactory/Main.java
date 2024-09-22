package Examples.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        EuropeCarFactory europeCarFactory = new EuropeCarFactory();
        Client carClient = new Client(europeCarFactory);

        System.out.println("Abstract Factory Result:");
        System.out.println(carClient.getElectricCarDetail());
        System.out.println(carClient.getSedanCarDetail());
        System.out.println(carClient.getSuvCarDetail());
    }
}
