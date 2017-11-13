
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
   private String color;
   private boolean convertable;
   public Car(String cl, boolean cv) {
       this.color = cl;
       this.convertable = cv;
   }
   
   public String getColor() {
       return this.color;
       
   }
   
   public boolean getConvertable() {
       return this.convertable;
       
   }
   
   public String toString() {
       return ("The color is " + color);
       
       
   }
   
   public boolean equals(Car other) {
       if (this.color.equals(other.color)) {
           return true;
       
        }
       return false;
   }   



}
