import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookShelf {
    private List<Book> books = new ArrayList<>();

    private int bookQ = 0;
    long id = 1;

    private Scanner sc = new Scanner(System.in);

    public void start() {
        System.out.println("Welcome to Book shelf");

        while (true) {
            System.out.println("Select and action:");
            System.out.println("1. View the list");
            System.out.println("2. Add a new book");
            System.out.println("3. Search the list");
            System.out.println("4. Delete book");

            System.out.println(">>>>");

            int action = sc.nextInt();

            switch(action) {
                case 1: list(); break;
                case 2: add(); break;
                case 3: search(); break;
                case 4: delete(); break;
            }
        }

    }

    public void list() {
        System.out.println("List of books");
        System.out.println("_________________________");
        System.out.println("ID |  NAME | TITLE | AUTHOR | PRICE");

        for(Book book : books){
            System.out.println(book);
        }
    }
    public void add(){
        System.out.println("Add a new book");
        Book bookAction = new Book();
        System.out.println("Name");
        bookAction.setName(sc.next());
        System.out.println("Title");
        bookAction.setTitle(sc.next());
        System.out.println("Author");
        bookAction.setAuthor(sc.next());
        System.out.println("PRICE");
        bookAction.setPrice(sc.nextDouble());

        bookAction.setId(id++);

        this.books.add(bookAction);
    }
    public void search() {
        System.out.println("Searching for book \n Enter the book field");

        String keyword = sc.next().toLowerCase();

        for (Book book : books) {
            if (
                    book.getName().toLowerCase().contains(keyword) ||
                            book.getTitle().toLowerCase().contains(keyword) ||
                            book.getAuthor().toLowerCase().contains(keyword) ||
                            String.valueOf(book.getPrice()).contains(keyword)
            ) {
                System.out.println(book);
            }
        }
    }

    public void delete() {
        System.out.print("Enter book ID: ");
        long bookId = sc.nextLong();

        boolean removed = false;
        if(exists(bookId)) {
            removed = books.removeIf(book -> book.getId() == bookId);
        }
        if (removed) {
            System.out.println("Book was deleted successfully!");
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public boolean exists(long id) {
        for (Book book : books) {
            if (book.getId() == id) return true;
        }
        return false;
    }

}
