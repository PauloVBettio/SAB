import java.util.Random;

public class Book implements Comparable<Book>{

    public enum BookState {
        Available,
        Borrowed
    }

    private String _author;
    private String _title;
    private int _uid;

    private BookState _state = BookState.Available;

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String _author) {
        this._author = _author;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public void setUid(int _uid) {
        this._uid = _uid;
    }

    public void setState(BookState _state) {
        this._state = _state;
    }

    public Book(String title, String author, int uid) {
        _author = author;
        _title = title;
        _uid = uid;
    }

    public BookState getState() {
        return _state;
    }

    public void updateState(BookState to) {
        _state = to;
    }

    public int getUid () {
        return _uid;
    }

    @Override
    public int compareTo(Book toCompare) {
        return Integer.compare(this._uid, toCompare.getUid());
    }
}
