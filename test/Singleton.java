import MyWallet;
import SingletonObject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Singleton {
    @Test
    public void test() {
        MyWallet myWallet = SingletonObject.getInstance();
        myWallet.addMoney(1000);
        myWallet.addPaper(1);

        Assertions.assertEquals(myWallet.checkMoney(), 1000);
        Assertions.assertEquals(myWallet.checkPaperCount(), 1);

        MyWallet sharedWallet = SingletonObject.getInstance();
        sharedWallet.addMoney(200);
        sharedWallet.addPaper(2);

        Assertions.assertEquals(sharedWallet.checkMoney(), 1200);
        Assertions.assertEquals(sharedWallet.checkPaperCount(), 3);
    }
}
