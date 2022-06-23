/**
 * Exercice sur les constructeurs
 */

package cours_exercices.cours;

// Classe Maison

import java.util.HashSet;

class Maison{
    // Propriétés
    private String materiau;
    private Integer surface;
    private BlocPorte blocPorte;

    
    // Constructeurs
    public Maison(String materiau, Integer surface){
        this.materiau=materiau;
        this.surface=surface;
    }
    
    // Constructeur appelant le constructeur de la classe BlocPorte.
    public Maison(String materiau, Integer surface, Integer hauteur, Integer largeur){
        this(materiau,surface);
        this.setBlocPorte(new BlocPorte(hauteur,largeur));
        
    }
    
    // Getters
    public BlocPorte getBlocPorte(){
        return this.blocPorte;
    }
    
    String getMateriau(){
        return this.materiau;
    }
    
    Integer getSurface(){
        return this.surface;
    }
    // Setters
    public void setMateriau(String newMateriau){
        this.materiau= newMateriau;
    }
    
    public void setSurface(Integer newSurface){
        this.surface= newSurface;
    }
    
    public void setBlocPorte(BlocPorte blocPorte){
        this.blocPorte=blocPorte;
    }
}
// Classe BlocPorte
class BlocPorte{
    // Propriétés
    private Integer hauteur;
    private Integer largeur;
    // Constructeur
    public BlocPorte(Integer hauteur, Integer largeur){
        this.hauteur=hauteur;
        this.largeur=largeur;
    }
    // Getters
    public Integer getLargeur(){
        return this.largeur;
    }
    public Integer getHauteur(){
        return this.hauteur;
    }
    // Setters    
    public void setHauteur(Integer h){
        this.hauteur= h;
    }
    public void setLargeur(Integer l){
        this.largeur= l;
    }
    
    
}
// Classe principale
public class Constructeurs {
    public static void main(String[] args) {
        Maison m= new Maison("bois",200);
        
        System.out.println(m.getMateriau());
        System.out.println(m.getSurface());
        
        m.setMateriau("caca");
        m.setSurface(5);
        
        System.out.println(m.getMateriau());
        System.out.println(m.getSurface());
        
        Maison petite= new Maison("pierre", 50, 2, 1);
        
        BlocPorte bp ;
        bp = petite.getBlocPorte();
        System.out.println(bp.getLargeur());
    }
}