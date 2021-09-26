
import java.util.*;

/**
 * 
 */
public class Utilisateur {

    /**
     * Default constructor
     */
    public Utilisateur(String prenom, String nom, String adrpost, String adrmail) {
        this.prenom = prenom;
        this.nom = nom;
        this.adrpost = adrpost;
        this.adrmail = adrmail;
    }


    /**
     * 
     */
    public String nom;

    /**
     * 
     */
    public String prenom;

    /**
     * 
     */
    public String adrpost;

    /**
     * 
     */
    public String adrmail;




    /**
     * @return
     */
    public Note consulterNotes(Rendu r) {
        r.getNote();
    }

    /**
     * @return
     */
    public void consulterDevoirs(Devoir devoir) {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public Cours consulterCours() {
        return null;
    }

    /**
     * @return
     */
    public int afficherPoints() {
        return 0;
    }

}