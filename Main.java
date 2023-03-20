import java.util.Scanner;

public class Main {

    static Library library = new Library("Biblioteca IFMT - Campus Primavera do Leste");
    static Librarian currentLibrarian = new Librarian("Lara");
    static User currentUser;
    static boolean running = true;
    static int currentSelection = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void InitializeLibrary() {
        library.AddBook(new Book("Antoine de Saint-Exupéry", "O Pequeno Príncipe", 0), 5);
        library.AddBook(new Book("A Arte da Guerra", "Sun Tzu", 1), 5);
        library.AddBook(new Book("Algoritmos - Teoria e Prática", "Ronald Rivest", 2), 5);
        library.AddBook(new Book("Código limpo: Habilidades práticas do Agile Software", "Robert C. Martin", 3), 5);


    }

    public static void main(String[] args) {
        InitializeLibrary();

        System.out.println("Seja bem vindo a: " + library.getName() + ". A bibliotecaria atual e: " + currentLibrarian.getUsername());
        System.out.println("Voce ainda nao tem uma conta. Vamos criar uma.");
        System.out.println("Digite um nome de usuario: ");
        String username = scanner.next();
        currentUser = new User(username);

        while (running) {
            System.out.println("O que deseja?\n1 - Listar Livros\n2 - Pesquisar Livro\n3 - Pegar livro\n4 - Devolver livro");
            currentSelection = scanner.nextInt();
            switch (currentSelection) {
                case 1:
                    for (Book book : library.GetBooks()) {
                        System.out.println(book.getUid() + ": " + book.getTitle());
                    }
            }

            System.out.println("Aperte \"ENTER\" para continuar...");
            scanner.nextLine();
            scanner.nextLine();

        }
    }
}
