/**
 * Exercice Heritage
 * 
 * Définissez une classe Cercle. Les objets construits à partir de cette classe
 * seront des cercles de tailles variées. En plus de la méthode constructeur
 * (qui utilisera donc un paramètre rayon), vous définirez les méthodes surface et périmètre
 * qui devront renvoyer la surface et le périmètre du cercle.
 * Définissez ensuite une classe Cylindre dérivée de la précédente.
 * Le constructeur de cette nouvelle classe comportera les deux paramètres rayon et hauteur.
 * Vous y ajouterez une méthode volume qui devra renvoyer le volume du cylindre
 * (rappel : volume d’un cylindre = surface de section × hauteur).
 */
package cours_exercices.exercices.hertiage;

// Classe Cercle
class Cercle{
    // Propriété
    private int rayon;
    
    // Constructeur
    public Cercle(int rayon) {
        this.rayon = rayon;
    }   
    
    // Getters
    public int getRayon() {    
        return rayon;
    }

    // Setters
    public void setRayon(int rayon) {
        this.rayon = rayon;
    }
    
    // Methodes
    public void calculateSurface(){
        System.out.println("surface : "+3.14*rayon*rayon);
    }
    public void calculatePerimeter(){
        System.out.println("Perimètre : "+3.14*2*rayon);
    }
}

// Classe Cylindre
class Cylindre extends Cercle {
    // Propriété
    private int hauteur;
    // Constructeur
    public Cylindre(int rayon, int hauteur){
        super(rayon);
        this.hauteur=hauteur;
    }
    // Getters
    public int getHauteur() {
        return hauteur;
    }
    
    // Setters
    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }
    
    // Methode
    public void calculateVolume(){
        System.out.println("Volume : "+3.14*getRayon()*getRayon()*hauteur);
    }
}

// Classe principale
public class ExHeritage {
    public static void main(String[] args) {
        Cylindre Cyl = new Cylindre(3,3);
        System.out.println("Rayon : "+Cyl.getRayon());
        Cyl.calculateSurface();
        Cyl.calculateVolume();
    }
}