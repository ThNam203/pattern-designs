package Adapter;

public class Client {
    public static void main(String[] args) {
        BookManager manager = new BookManager();
        manager.Start();
        manager.Read();
        manager.ShowInformation();
    }
}
