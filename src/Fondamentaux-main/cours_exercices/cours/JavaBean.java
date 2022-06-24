/**
 * Exemple sur JavaBean
 */

package cours_exercices.cours;

// Import de Serializable pour créer un JavaBean
import java.io.Serializable;


// Création d'un JavaBean
public class JavaBean implements Serializable{
    
    // Propriétés
    private static final long serialVersionUID= -11651531231L; //N° de série du javaBean, correspond à un identifiant de classe
    private Integer numero;
    private String libelle;
    // Constructeur sans paramètres
    public JavaBean(){
        System.out.println("execution du constructeur JavaBean");
    }
    // Getters
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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
