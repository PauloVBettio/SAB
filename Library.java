import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Library {
    private String _name;
    ArrayList<User> users;
    ArrayList<Book> _books = new ArrayList<Book>();

    public Library(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public Map<Integer, Book> FindBook(int uniqueId) {
        Map<Integer, Book> foundBooks = new HashMap<>();
        int i = 0;
        for (Book book : _books) {
            if (book.getUid() != uniqueId) continue;
            foundBooks.put(i, book);
            i++;
        }

        return null;
    }

    public void AddBook(Book book) {
        _books.add(book);
        Collections.sort(_books);
    }

    public void AddBook(Book book, int count) {
        for (int i = 0; i < count; i++) {
            _books.add(book);
        }
        Collections.sort(_books);
    }

    public ArrayList<Book> GetBooks() {
        return _books;
    }
}
