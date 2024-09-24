import Adapter.EBookAdapter;
import Adapter.Kindle;
import Adapter.PaperBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaperBookTest {
    private PaperBook paperBook;

    @BeforeEach
    void setUp() {
        paperBook = new PaperBook();
    }

    @Test
    void testOpen() {
        assertEquals("Book is opened by hand", paperBook.open());
        assertEquals(0, paperBook.currentPage);
    }

    @Test
    void testTurnPageBeforeOpening() {
        assertEquals("Book hasn't been opened yet", paperBook.turnPage());
    }

    @Test
    void testTurnPageAfterOpening() {
        paperBook.open();
        assertEquals("Book opens at page 1", paperBook.turnPage());
        assertEquals("Book opens at page 2", paperBook.turnPage());
    }

    @Test
    void testGetBookInformationBeforeOpening() {
        assertEquals("Paper book with hard-cover, has not been opened", paperBook.getBookInformation());
    }

    @Test
    void testGetBookInformationAfterOpening() {
        paperBook.open();
        assertEquals("This book is a hard-cover paper book, currently reading on page 0", paperBook.getBookInformation());
    }
}

class KindleTest {
    private Kindle kindle;

    @BeforeEach
    void setUp() {
        kindle = new Kindle();
    }

    @Test
    void testUnlock() {
        assertEquals("The book is unlocked with a Kindle key", kindle.unlock());
    }

    @Test
    void testPressNextWithoutUnlocking() {
        assertEquals("Book is not unlocked, requires a Kindle key", kindle.pressNext());
    }

    @Test
    void testPressNextAfterUnlocking() {
        kindle.unlock();
        assertEquals("Kindle book is presenting page 1", kindle.pressNext());
        assertEquals("Kindle book is presenting page 2", kindle.pressNext());
    }

    @Test
    void testGetDigitalInformationBeforeUnlocking() {
        assertEquals("Kindle book is locked with no digital information", kindle.getDigitalInformation());
    }

    @Test
    void testGetDigitalInformationAfterUnlocking() {
        kindle.unlock();
        assertEquals("The Kindle book is unlocked and current reading page is 0", kindle.getDigitalInformation());
    }
}

class EBookAdapterTest {
    private Kindle kindle;
    private EBookAdapter ebookAdapter;

    @BeforeEach
    void setUp() {
        kindle = new Kindle();
        ebookAdapter = new EBookAdapter(kindle);
    }

    @Test
    void testOpen() {
        assertEquals("The book is unlocked with a Kindle key", ebookAdapter.open());
    }

    @Test
    void testTurnPageWithoutUnlocking() {
        assertEquals("Book is not unlocked, requires a Kindle key", ebookAdapter.turnPage());
    }

    @Test
    void testTurnPageAfterUnlocking() {
        ebookAdapter.open();
        assertEquals("Kindle book is presenting page 1", ebookAdapter.turnPage());
        assertEquals("Kindle book is presenting page 2", ebookAdapter.turnPage());
    }

    @Test
    void testGetBookInformationBeforeUnlocking() {
        assertEquals("Kindle book is locked with no digital information", ebookAdapter.getBookInformation());
    }

    @Test
    void testGetBookInformationAfterUnlocking() {
        ebookAdapter.open();
        assertEquals("The Kindle book is unlocked and current reading page is 0", ebookAdapter.getBookInformation());
    }
}