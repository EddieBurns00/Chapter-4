package TeamWork;


/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    private String name;
    private int age;
    public Athlete (String nm, int a) {
        this.name = nm;
        this.age = a;
        
    }
    
    public String toString() {
        return "His name is " + name + " and he is " + age + " and he wants to change the world.";
        
    }
}
