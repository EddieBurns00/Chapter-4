package LibraryWork;


/**
 * Write a description of class Library here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Library
{
    private String name;
    private Book[] books;
    
    public Library (String nm, int size) {
        this.name = nm;   
        this.books = new Book[size];
    }
    
    public String toString() {
        String output = "The library " + name + " has the following books: \n";
        for (Book b : books) {
            output += b + "\n";
        }
        return output;
        
    }
    
    public void addBook(int location, Book b) {
        books[location] = b;
        
    }
}
