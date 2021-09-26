
import java.util.*;

/**
 * 
 */
public class Devoir {

    /**
     * Default constructor
     */
    public Devoir(String nom, String desc, Date deadline, int nbrPoints) {
        this.nom = nom;
        this.desc = desc;
        this.deadline = deadline;
        this.nbrPoints = nbrPoints;
    }
    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String desc;

    /**
     * 
     */
    public Date deadline;

    /**
     * 
     */
    public int nbrPoints;


    public Points afficherPoints() {
        // TODO implement here
        return nbrPoints;
    }

}