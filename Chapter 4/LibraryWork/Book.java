package LibraryWork;


/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author bookAuthor;
    private String title;
    
    public Book (Author a, String tl) {
        this.bookAuthor = a;
        this.title = tl;
        
    }
    
    public String toString() {
        return ("The book's title is " + this.title + ". " + this.bookAuthor);
        
        
    }
}
