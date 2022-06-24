/**
 * Exercice JavaBean 2
 * 
 * Créer un javaBeans Article ayant les propriétés suivantes :
 * numero, libelle
 */

package cours_exercices.exercices.javaBeans.ex2;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;

// Création d'un JavaBean
public class Article implements Serializable{
    
    private static final long serialVersionUID= -77L; //N° de série du javaBean, correspond à un identifiant de classe
    // Propriétés
    private Integer numero;
    private String libelle;

    // Constructeur sans paramètres
    public Article(){
        this.numero=null;
        this.libelle=null;
    }
    
    //constructeur
      public Article(Integer num, String article){
        this.numero=num;
        this.libelle=article;
    }

    // Getters
    public Integer getNumero() {
        return numero;
    }

    public String getLibelle() {
        return libelle;
    }

    // Setters

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}