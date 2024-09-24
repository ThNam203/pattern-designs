package Adapter;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    public List<Book> bookShelf;

    BookManager() {
        this.bookShelf = new ArrayList<>();
    }

    public void Start() {
        Book paperBook = new PaperBook();
        bookShelf.add(paperBook);

        Kindle kindleEBook = new Kindle();
        EBookAdapter eBookAdapter = new EBookAdapter(kindleEBook);
        bookShelf.add(eBookAdapter);
    }

    public void Read() {
        // open and read paper book
        Book paperBook = bookShelf.getFirst();
        System.out.println(paperBook.open());
        System.out.println(paperBook.turnPage());
        System.out.println(paperBook.turnPage());

        // open and read ebook
        Book eBook = bookShelf.getLast();
        System.out.println(eBook.open());
        System.out.println(eBook.turnPage());
    }

    public void ShowInformation() {
        // show paper book information
        Book paperBook = bookShelf.getFirst();
        System.out.println(paperBook.getBookInformation());

        // show ebook information
        Book eBook = bookShelf.getLast();
        System.out.println(eBook.getBookInformation());
    }
}
