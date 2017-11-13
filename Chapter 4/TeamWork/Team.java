package TeamWork;


/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    private String teamName;
    private Athlete[] players;
    public Team (String tn, int size) {
        this.teamName = tn;
        this.players = new Athlete[size];
        
    }
    
    public String toString() {
        String output = "The team " + teamName + " has the following players: \n";
        for (Athlete b : players) {
            output += b + "\n";
        }
        
        return output;
    }
    
    public void addAthlete (int index, Athlete a) {
        players[index] = a;
        
    }
}
