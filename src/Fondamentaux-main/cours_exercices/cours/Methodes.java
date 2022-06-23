/**
 * Exemple sur les méthodes
 */

package cours_exercices.cours;

// Classe principale
public class Methodes {
    // Méthode sans paramètre et ne retournant pas de valeur.
    public void ecrit(){
        System.out.println("la methode erit");
    }

    // Méthode avec un paramètre et ne retournant pas de valeur.
    public void ecrit2(String monTexte){
        System.out.println(monTexte);
    }

    // Méthode avec plusieurs paramètres et ne retournant pas de valeur.
    public void ecritParam2(String monTexte,String monAutreTexte){
        System.out.println(monTexte);
        System.out.println(monAutreTexte);
    }

    // Méthode avec paramètre et retournant une valeur.
    public int carre(int valeur){
        return valeur*valeur;
        
    }
    
    // Méthode principale
    //public static est le point d'entrée de la classe "Méthodes".
    public static void main(String[] args){
        
        //Cette ligne permet d'appeler dans la méthode principale
        Methodes m = new Methodes();
        
        m.ecrit();
        m.ecrit2("blablabla");
        System.out.println(m.carre(2));
    }
    
}