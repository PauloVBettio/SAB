public class Transaction {
    public enum TransactionType {
        Borrow,
        Devolution
    }

    public Librarian By;
    public User User;
    public TransactionType Type;
}
