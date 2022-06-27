/**
 * Exemple sur les interfaces multiples
 */

package cours_exercices.cours;

// Interface Radio
interface IRadio{
    void setVolume(Integer volume);
    
    // Méthode default nommée start;. Default permet de définir une fonction dans une interface.
    default void start(){
        System.out.println("Sonne comme une radio");
    }
}

// Interface reveil
interface IReveil{
    void setHeure(String heure);
    
    // Méthode default nommée start. Default permet de définir une fonction dans une interface.
    default void start(){
        System.out.println("Sonne comme un reveil");
    }
}
// Classe RadioReveil implémentant les interfaces
class RadioReveil implements IRadio, IReveil{
    // Propriétés
    // radio = true, reveil = false
    private Boolean typeReveil;
    private String heure;
    private Integer volume;
    
    // Constructeur
    public RadioReveil(Boolean typeReveil){
        this.typeReveil= typeReveil;
        this.heure="00h00";
        this.volume=0;
    }
    
    // Methode avec choix de la méthode default à utilisé
    @Override public void start(){
        if(typeReveil){
            IRadio.super.start();
        }
        else{
            IReveil.super.start();
        }
    }

    // Getters
    public String getTypeReveil(){
        return (this.typeReveil)? "Radio":"Reveil" ;
    }
    
    public String getHeure() {
        return heure;
    }

    public Integer getVolume() {
        return volume;
    }
    
        
    // Setters

    @Override
    public void setHeure(String heure) {
        this.heure = heure;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    
}
// Classe principale
public class InterfacesMultiples {
    public static void main(String[] args) {
        Boolean radioReveil=false;
        
        // radio = true, reveil = false
        RadioReveil rr= new RadioReveil(radioReveil);
        System.out.println("Type : "+ rr.getTypeReveil());
        System.out.println("Heure : "+ rr.getHeure());
        System.out.println("Volume : "+ rr.getVolume());
        
        rr.start();
        
        System.out.println("");
        
        rr.setVolume(100);
        rr.setHeure("12h15");
        
        System.out.println("Type : "+ rr.getTypeReveil());
        System.out.println("Heure : "+ rr.getHeure());
        System.out.println("Volume : "+ rr.getVolume());
        
        rr.start();
    }
}