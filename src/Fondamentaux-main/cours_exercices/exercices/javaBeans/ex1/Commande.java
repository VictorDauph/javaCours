/**
 * Exercice JavaBean 1
 * 
 * Créer un JavaBean Commande ayant les propriétés suivantes :
 * id, clientId, libelle, prixUnitaire, nombreDeJours, tva, etats, type, notes
 */

package cours_exercices.exercices.javaBeans.ex1;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;


// JavaBean Commande
public class Commande implements Serializable{
    private static final long serialVersionUID= -75L; //N° de série du javaBean, correspond à un identifiant de classe
    // Propriétés
    private final int id;
    private int clientID;
    private String libelle;
    private int prixUnitaire;
    private int nombreDeJours;
    private int tva;
    private String etats;
    private String notes;
    
    // Constructeurs
    public Commande(){
        this.id=0; //mettre un random
    }
    
    public Commande(int id, int clientID, String libelle, int prixUnitaire, int nombreDeJours, int tva, String etats, String notes) {
        this.id = id;
        this.clientID = clientID;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.nombreDeJours = nombreDeJours;
        this.tva = tva;
        this.etats = etats;
        this.notes = notes;
    }
    
    // Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public int getClientID() {
        return clientID;
    }

    public String getLibelle() {
        return libelle;
    }

    public int getPrixUnitaire() {
        return prixUnitaire;
    }

    public int getNombreDeJours() {
        return nombreDeJours;
    }

    public int getTva() {
        return tva;
    }

    public String getEtats() {
        return etats;
    }

    public String getNotes() {
        return notes;
    }

    // Setters

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setPrixUnitaire(int prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public void setNombreDeJours(int nombreDeJours) {
        this.nombreDeJours = nombreDeJours;
    }

    public void setTva(int tva) {
        this.tva = tva;
    }

    public void setEtats(String etats) {
        this.etats = etats;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}