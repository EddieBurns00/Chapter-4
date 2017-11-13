package LibraryWork;


/**
 * Write a description of class AHSLibrary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AHSLibrary
{
    public static void main(String[] args) {
        Library ahs = new Library("Acalanes", 10);
        Author adolf = new Author("Adolf Hitler", 43);
        Book b = new Book(adolf, "Mein Kampf");
        ahs.addBook(0,b);
        System.out.println(ahs);
        
        
    }
}
