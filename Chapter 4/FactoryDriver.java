
/**
 * Write a description of class FactoryDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryDriver
{
  public static void main(String[] args) {
      Factory tesla = new Factory("123 main st", 1);
      
      Car modelS = new Car("Blue", false);
      tesla.addCar( modelS ,0);
      int i = 2;
      System.out.println(i++);
      
  }
}
