/**
 * Exemple sur les classes
 */

package cours_exercices.cours;

// Définition d'une classe avec visibilité limitée au package
    // Attribut public
class UneClasse{
    
    // Emploi de this dans une methode de la classe
    public int cpt=10;
    public int addition(){
        this.cpt +=15;
        return this.cpt+15;
    }
        
    // Méthode private
    private int carre(int i){
        return i*i;
    }
    
    // Méthode publique
    public int cube(int i){
        return i * carre(i);
    }
}

// Classe publique Classes

public class Classes{
    // Méthode sans valeur de retour
    public void sansRetour(){
        System.out.println("sans retour");
    }
    // Methode avec valeur de retour
    public int avecRetour(){
        int i=5;
        System.out.println("Je retourne : "+i);
        return i;
    }
    // Méthode avec retour et paramètre
    public int avecParamEtRetours(int i){
        return i*5;
    }

    // Méthode principale
    public static void main(String[] args){
        // Création d'un nouvel objet de type Classes nommé mc
        Classes mc= new Classes();
        
        // Appel de la méthode sansRetour
        mc.sansRetour();
        
        // Appel de la méthode avecRetour
        int j=mc.avecRetour();
        
        // Appel d'une methode avec retour et paramètre 
        int k=mc.avecParamEtRetours(j);
        System.out.println("avec retours et params : "+k);
        
        // Création d'un objet de la classe uneClasse nommé uc
        UneClasse uc = new UneClasse();
        UneClasse uc2 = new UneClasse();
        
        // Appel de l'attribut public d'une classe
        System.out.println("cpt : "+uc.cpt);
        uc.cpt = 20;
        System.out.println("cpt : "+uc.cpt);

        // Appel de la methode cube de la classe uneClasse
        System.out.println("cube uc.cpt : "+uc.cube(uc.cpt));
        System.out.println("cube uc2.cpt2 : "+uc2.cube(uc2.cpt));

        // Appel de la methode carre de la classe uneClasse impossible, car elle est privée
        // System.out.println(uc.carre(uc.cpt));     
        
        // Appel de la methode addition de la classe uneClasse
        System.out.println(uc.addition());
        System.out.println(uc2.addition());
        System.out.println(uc2.addition());
    }
}