package kz.bitlab.techorda.db;

import java.util.ArrayList;

public class DBManager {
    private static final ArrayList<kz.bitlab.techorda.db.Book> books = new ArrayList<>();
    private static int id = 5;

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
