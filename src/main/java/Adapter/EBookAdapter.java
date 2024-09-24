package Adapter;

public class EBookAdapter implements Book {
    Kindle kindle;

    public EBookAdapter(Kindle kindle) {
        this.kindle = kindle;
    }

    @Override
    public String open() {
        return this.kindle.unlock();
    }

    @Override
    public String turnPage() {
        return this.kindle.pressNext();
    }

    @Override
    public String getBookInformation() {
        return this.kindle.getDigitalInformation();
    }
}
