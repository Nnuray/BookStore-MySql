package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<kz.bitlab.techorda.db.Book> books = new ArrayList<>();
    private static int id = 5;

    static {
        books.add(
                new kz.bitlab.techorda.db.Book(1,
                        "Harry Potter and Philosophy stone",
                        "Joane Rowling",
                        "Fantasy",
                        5000,
                        "Surviving after Voldemort's attack"
                )
        );

        books.add(
                new kz.bitlab.techorda.db.Book(2,
                        "Harry Potter and Azkaban prison",
                        "Joane Rowling",
                        "Fantasy",
                        6000,
                        "Sirius Black after Azkaban"
                )
        );

        books.add(
                new kz.bitlab.techorda.db.Book(3,
                        "Harry Potter and the Chamber of Secrets",
                        "Joane Rowling",
                        "Fantasy",
                        7000,
                        "film about Chamber of Secrets"
                )
        );

        books.add(
                new kz.bitlab.techorda.db.Book(4,
                        "Harry Potter and the Goblet of Fire",
                        "Joane Rowling",
                        "Fantasy",
                        4000,
                        "Film about Goblet of fire"
                )
        );
    }
    public static ArrayList<kz.bitlab.techorda.db.Book> getBooks(){
        return books;
    }
    public static void addBooks(kz.bitlab.techorda.db.Book book){
        book.setId(id);
        books.add(book);
        id++;
    }
    public static kz.bitlab.techorda.db.Book getBook(int id){
        return books
                .stream()
                .filter(book -> book.getId()==id)
                .findFirst()
                .orElse(null);
    }

    public static void updateBook(kz.bitlab.techorda.db.Book kitap){
        for(int i=0; i<books.size(); i++){
            if(books.get(i).getId()==kitap.getId()){
                books.set(i, kitap);
                break;
            }
        }
    }

    public static void deleteBook(int id){
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId()==id){
                books.remove(i);
                break;
            }
        }
    }
}
