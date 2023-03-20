import java.util.ArrayList;
import java.util.Random;

public class User {
    private int _uid;
    private String _username;
    ArrayList<Book> _borrowedBooks = new ArrayList<Book>();

    public User(String username) {
        _username = username;
        _uid = new Random().nextInt();
    }

    public int getUid() {
        return _uid;
    }

    public void setUid(int _uid) {
        this._uid = _uid;
    }

    public String getUsername() {
        return _username;
    }

    public void setUsername(String _username) {
        this._username = _username;
    }

    public void BorrowBookFromLibrary() {

    }

    public void ReturnBookToLibrary() {

    }
}
