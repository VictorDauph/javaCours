/**
 * Exercice Interface
 * 
 * Ecrire une interface nommée FigureGeometrique
 * cette interface doit avoir la déclaration de 2 méthodes :
 * getAire() et getPerimetre()
 * 
 * Ecrire les classes Carre, Cercle, Rectangle et TriangleRectangle implémentant l'interface
 * 
 * Ecrire une classe principale appelant
 */
package cours_exercices.exercices.interfaces;

// Interface FigureGeométrique
interface IFigureGeometrique{
    public Double getAire();
    public Double getPerimetre();

}
// Classe Carre
class Carre implements IFigureGeometrique{
    
    // propriété
    private Double cote;
    
    // Constructeur
    public Carre(Double cote){
        this.cote=cote;
    }
    
    // Getter
    public Double getCote() {
        return cote;
        
    }
    // Setter
    public void setCote(Double cote) {
        this.cote = cote;
    }
    
    // Implementation des méthodes de l'interface
    @Override public Double getAire(){
        return this.cote*this.cote ;
    }
    
    @Override public Double getPerimetre(){
        return cote*4;
    }
}

// Classe Cercle
class Cercle implements IFigureGeometrique{
    
    // Propriété
    private Double rayon;
    
    // Constructeur
    public Cercle(Double rayon){
        this.rayon=rayon;
    }
    
    
    // Getter
    public Double getRayon() {
        return rayon;
    }
    
    // Setter
    public void setRayon(Double rayon) {
        this.rayon = rayon;
    }
    
    // Implementation des méthodes de l'interface
    @Override public Double getAire(){
        return 3.14*getRayon()*getRayon();
    }
    
    @Override public Double getPerimetre(){
        return 2*3.14*getRayon();
    }
}

// Classe Rectangle
class Rectangle implements IFigureGeometrique{
    // Propriétés
    private Double a;
    private Double b;
    
    // Constructeur
    public Rectangle(Double a, Double b){
        this.a=a;
        this.b=b;
    }
    
    // Getters
        public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }
    
    // Setters
    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }
    
    // Implementation des méthodes de l'interface
    @Override public Double getAire(){
        return getA()*getB();
    }
    
    @Override public Double getPerimetre(){
        return 2*getA()+2*getB();
    }

}
// Classe TriangleRectangle
class TriangleRectangle implements IFigureGeometrique {
    // Propriétés
    private Double a;
    private Double b;
    
    // Constructeur
    public TriangleRectangle(Double a, Double b){
        this.a=a;
        this.b=b;
    }
    
    // Getters
        public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }
    
    // Setters
    public void setA(Double a) {
        this.a = a;
    }

    public void setB(Double b) {
        this.b = b;
    }

    // Implementation des méthodes de l'interface
    @Override public Double getAire(){
        return getA()*getB()/2;
    }
    
    @Override public Double getPerimetre(){
        return getA()+getB()+Math.sqrt(getA()*getA()+getB()*getB());
    }
}

// Classe principale
public class ExInterfaces {
    public static void main(String... args) {
        Carre carre= new Carre(1.0);
        Cercle cercle=new Cercle(1.0);
        
        System.out.println("aire carré : "+carre.getAire()); 
        System.out.println("perimètre carré : "+carre.getPerimetre() );
        
        System.out.println("aire cercle : "+cercle.getAire()); 
        System.out.println("perimètre cercle : "+cercle.getPerimetre() );
    }
}