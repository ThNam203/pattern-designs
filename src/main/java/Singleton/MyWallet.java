package Singleton;

public class MyWallet {
    int money;
    int paperCount;

    public MyWallet(int money, int paperCount) {
        this.money = money;
        this.paperCount = paperCount;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void addPaper(int paperCount) {
        this.paperCount += paperCount;
    }

    public void subtractMoney(int money) {
        this.money -= money;
    }

    public void removePaper(int paperCount) {
        this.paperCount -= paperCount;
    }

    public int checkMoney() {
        return this.money;
    }

    public int checkPaperCount() {
        return this.paperCount;
    }
}
