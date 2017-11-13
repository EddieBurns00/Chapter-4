package LibraryWork;


/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;
    public Author (String nm, int ag) {
        this.name = nm;
        this.age = ag;
        
        
    }
    
    public String toString() {
        return ("The author's name is " + this.name); 
        
        
    }
}