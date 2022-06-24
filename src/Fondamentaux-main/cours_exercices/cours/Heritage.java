/**
 * Exemple sur l'héritage
 */

package cours_exercices.cours;

// Classe Compte simple
class Compte{
    // Propriétés
    private Double solde;
    private String proprietaire;
    // Constructeur
    public Compte(Double solde, String propriétaire) {
        this.solde = solde;
        this.proprietaire = propriétaire;
    }
    // Getters

    public Double getSolde() {
        return solde;
    }

    public String getProprietaire() {
        return proprietaire;
    }
    
    public String getElements() {
        return "Propriétaire : " + this.proprietaire + "solde :" + this.solde;
    }
    
    // Setters

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }
}
    
    





// Classe CompteBancaire héritant de Compte
class CompteBanquaire extends Compte{
    // Propriété
    private String nomBanque;
    
    // Constructeur
    public CompteBanquaire(Double solde, String proprietaire, String nomBanque){
        // Appel le constructeur de la classe mère
        super(solde,proprietaire);
        this.nomBanque=nomBanque;
    }
    // Getters
    public String getNomBanque() {
        return nomBanque;
    }
    
    public String getElements(){ //redéfinition de fonction de la classe mère
        return super.getElements() + " -Nom de la banque : " + this.nomBanque;
    }
    
    //Setter
    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }
        
}

// Classe principale
public class Heritage {
    public static void main(String[] args) {
        CompteBanquaire cb = new CompteBanquaire(100.0,"Victor", "Banque du sperme");
        Compte c = new Compte(500.0,"Victor");
        System.out.println(cb.getElements());
        System.out.println(c.getElements());
        
    }
}