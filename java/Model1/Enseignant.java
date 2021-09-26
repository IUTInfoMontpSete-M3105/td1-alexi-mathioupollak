
import java.util.*;

/**
 * 
 */
public class Enseignant extends Utilisateur {

    /**
     * Default constructor
     */
    public Enseignant(String prenom, String nom, String adrpostale, String adrmail, int numem, int harpege) {
        super(prenom, nom, adrpostale, adrmail);
        this.numem = numem;
        this.harpege = harpege;
    }

    /**
     * 
     */
    public int Numem;

    /**
     * 
     */
    public int Harpège;










    /**
     * @return
     */
    public Devoir create(String nom, String desc, Date deadline, int nbrPoints) {
        return new Devoir(nom, desc, deadline, nbrPoints);
    }


    public void attribuer(Rendu rendu, int note) {
        rendu.setNote(note);
    }


    public void donnerAvis(Rendu rendu, String avis) {
        rendu.setNote(avis);
    }

    public Note consulter() {
        // TODO implement here
        return null;
    }

}