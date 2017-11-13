
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    private String color;
    private boolean style;
    private int price;
    public Hat(String cl, boolean st, int pr) {
        this.color = cl;
        this.style = st;
        this.price = pr;
    }
    
    public String toString() {
        return ("this hat is " + color);
    }
    
    public String getColor() {
        return this.color;
        
        
    }
}
