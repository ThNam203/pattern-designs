package Adapter;

public class PaperBook implements Book {
    public int currentPage = -1;

    @Override
    public String open() {
        currentPage = 0;
        return "Book is opened by hand";
    }

    @Override
    public String turnPage() {
        if (currentPage == -1) return "Book hasn't been opened yet";

        currentPage += 1;
        return "Book opens at page " + currentPage;
    }

    @Override
    public String getBookInformation() {
        if (this.currentPage == -1) return "Paper book with hard-cover, has not been opened";
        return "This book is a hard-cover paper book, currently reading on page " + this.currentPage;
    }
}
