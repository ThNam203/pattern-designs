package SingletonPattern;

public class SingletonObject {
    private static MyWallet myWallet = null;

    public static MyWallet getInstance() {
        if (myWallet == null) {
            myWallet = new MyWallet(0, 0);
        }

        return myWallet;
    }
}
