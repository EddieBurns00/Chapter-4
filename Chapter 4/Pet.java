
/**
 * Write a description of class Pet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pet
{
   private String name;
   private boolean alive;
   private static int numPets;
   
   
   
   public Pet(String nm, boolean alv) {
       this.name = nm;
       this.alive = alv;
       numPets ++;
   }
   
   public String toString() {
       return ("This pet's name is " + name);  
       
   }
   
   public String getName() {
       return this.name;

   }
   
   public boolean equals(Pet other) {
       if(this.name.equals(other.name)) {
           return true;}
       else {
           return false;
       }
       
   }
   
   public static void example() {
       System.out.println("This is a static method!");
       
   }
   
}
