/*
 * What happends as hashcode and equal is not overriden?
 * 
 * 
 */
package CollectionFun.SetFun;

import CollectionFun.Book;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author YNZ
 */
public class HashSetHash {
    
    public static void main(String[] args) {
        
        Set<Book> myBooks = new HashSet<>();
        myBooks.add(new Book("Java Generics and Collections"));
        myBooks.add(new Book("Java Generics and Collections"));
        myBooks.add(new Book("Java Generics and Collections"));
        System.out.println(myBooks);
    }
    
}
