
/**
 * Write a description of class PetDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PetDriver
{
    public static void main() {
        Pet pam = new Pet("Pam", true);
        System.out.println(pam.getName());
        Pet mike = new Pet("Pam", true);
        System.out.println(pam.equals(mike));
        Pet.example();
    }
}
