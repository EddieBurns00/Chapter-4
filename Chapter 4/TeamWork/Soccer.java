package TeamWork;


/**
 * Write a description of class Soccer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soccer
{
    public static void main(String[] args) {
        Team dons = new Team("Dons", 11);
        Athlete jack = new Athlete("Jack Wickline", 16);
        dons.addAthlete(0,jack);
        Athlete timo = new Athlete("Timo Jimenez", 16);
        dons.addAthlete(1,timo);
        Athlete colin = new Athlete("Colin Kirbach", 17);
        dons.addAthlete(2,colin);
        System.out.println(dons);
        
    }
}
