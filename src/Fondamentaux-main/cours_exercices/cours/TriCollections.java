/**
 * Exemple sur le tri des collections
 */

package cours_exercices.cours;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

// Classe de tri de Planètes implémentant l'interface Comparator
class ComparateurPlanetes implements Comparator<Planete>{
    @Override public int compare(Planete p1, Planete p2){
        //ici on fait un tri personnalisé.
       return p1.taille.compareTo(p2.taille);
    }
}

// Classe Planète
class Planete{
    // Attributs
    public String nom;
    public Integer taille;
    public Integer distance;
    
    // Constructeur
    public Planete(String nom, Integer taille, Integer distance) {
        this.nom = nom;
        this.taille = taille;
        this.distance = distance;
    }
}

// Classe de tri simple
class TriSimple{
    // Méthode de tri classique
    public void triListeClassique(){
        // Création d'une liste de type List non triée
        List<String> maListeNonTriee = new ArrayList<>();
        maListeNonTriee.add("Vaucluse");
        maListeNonTriee.add("Allier");
        maListeNonTriee.add("Loire");
        

        // Tri d'une Collection List
        Collections.sort(maListeNonTriee);

        // Affichage des éléments de la liste
        System.out.println(maListeNonTriee);
    }
}

// Classe principale
public class TriCollections {
    public static void main(String[] args) {
        // Appel d'un tri simple
        TriSimple ts = new TriSimple();
        ts.triListeClassique();
        
        // Saut de ligne
        System.out.println("");
        
        // Création et chargement d'une liste de type List
        List<Planete> listeDesPlanetes = new ArrayList<>();
        listeDesPlanetes.add(new Planete("Neptune",50000,4500));
        listeDesPlanetes.add(new Planete("Mars",6400,227));
        listeDesPlanetes.add(new Planete("Mercure",4800,58));
        listeDesPlanetes.add(new Planete("Jupiter",11000,1100));
        
        // Implémentation de Comparator : on instancie l'interface en fournissant immédiatement l'implémentation de la méthode compare
                // Comparaison par rapport à la propriété taille de la classe Planete
        Comparator<Planete> comparateurDeTaille = (Planete p1, Planete p2)-> p1.taille.compareTo(p2.taille) ;
        

        // Méthode 1
        System.out.println("Methode 1");
        // Tri de la collection de type Planete via la méthode sort() de la classe Collections
        // en utilisant l'implémentation directe de Comparator ci-dessus
        Collections.sort(listeDesPlanetes,comparateurDeTaille);

        
        // Affichage des infos des planètes
        for (Planete element : listeDesPlanetes ){
            System.out.println("nom : "+ element.nom+ "; taille : "+ element.taille);
        }
        // Saut de ligne
        System.out.println("");
        
        // Méthode 2
        System.out.println("Methode 2");
        // Tri de la collection de type Planete via la méthode sort() de la classe Collections
        // en utilisant l'implémentation faite dans la classe ComparateurPlanetes
        Collections.sort(listeDesPlanetes, new ComparateurPlanetes());
        
        // Affichage des infos des planètes
        for (Planete element : listeDesPlanetes) {
            System.out.println("Nom : " + element.nom + " - Taille : " + element.taille + " - Distance : " + element.distance);
        }
    }
}