public class Book {
    private long id;
    private String name;
    private String title;
    private String author;
    private double price;

    public Book(long id, String name, String title, String author, double price) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {

    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + title + " | " + author + " | " + price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
