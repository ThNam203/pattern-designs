package Adapter;

public class Kindle implements EBook {
    private boolean isUnlocked = false;
    private int currentPage = 0;

    @Override
    public String unlock() {
        isUnlocked = true;
        return "The book is unlocked with a Kindle key";
    }

    @Override
    public String pressNext() {
        if (!isUnlocked) return "Book is not unlocked, requires a Kindle key";

        currentPage += 1;
        return "Kindle book is presenting page " + this.currentPage;
    }

    @Override
    public String getDigitalInformation() {
        if (!isUnlocked) return "Kindle book is locked with no digital information";
        return "The Kindle book is unlocked and current reading page is " + this.currentPage;
    }
}
