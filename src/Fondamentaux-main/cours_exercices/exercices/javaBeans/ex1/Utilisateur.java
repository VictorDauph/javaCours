/**
 * Exercice JavaBean 1
 * 
 * Créer un JavaBean Utilisateur ayant les propriétés suivantes :
 * id, nom, mdp, courriel, acces
 */

package cours_exercices.exercices.javaBeans.ex1;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;


// JavaBean Utilisateur
public class Utilisateur implements Serializable{
    
    private static final long serialVersionUID= -76L; //N° de série du javaBean, correspond à un identifiant de classe
    
    // Propriétés
    private final int id;
    private String nom;
    private String mdp;
    private String courriel;
    private String acces;
    
    // Constructeurs
    
    public Utilisateur(int id, String nom, String mdp, String courriel, String acces) {
        this.id = id;
        this.nom = nom;
        this.mdp = mdp;
        this.courriel = courriel;
        this.acces = acces;
    }
    
    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMdp() {
        return mdp;
    }

    public String getCourriel() {
        return courriel;
    }

    public String getAcces() {
        return acces;
    }
    
        
    // Setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public void setAcces(String acces) {
        this.acces = acces;
    }
    
    
}