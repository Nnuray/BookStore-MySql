package kz.bitlab.techorda.db;

public class Book {
    private int id;
    private String name;
    private Author author;
    private String genre;
    private int price;
    private String description;
    public Book(){

    }

    public Book(int id, String name, Author author, String genre, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
    }

    public Book(int id, String name, Author author, String genre, int price, String description) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
