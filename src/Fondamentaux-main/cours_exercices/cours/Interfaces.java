/**
 * Exemple sur les interfaces
 */

package cours_exercices.cours;

// Interface machine à laver
interface IMachineALaver {
    // Enumérations (declaration de constantes)
    enum Reglage{ PRELAVAGE,LAVAGE,SECHAGE }
    static final int CONSTANTE=5;

    // Méthodes déclarées dans l'interface (declarées mais non définies).
    public void setReglage(Reglage reglage);
    
    Reglage getReglage();
    Boolean getFonctionnement();
    Boolean getEtatHublot();
    
    Boolean stopStart();
    Boolean fermerHublot();
    Boolean ouvrirHublot();
}

// Classe MachineALaver implémentant l'interface
class MachineALaver implements IMachineALaver{
    
    // Propriétés
    private final int CONST;
    private Reglage etat;
    private Boolean fonctionnement;
    private Boolean etatHublot;
    //etatHublot true = ouvert ; false = fermer
    

    // Constructeur
    public MachineALaver(){
        this.CONST=CONSTANTE;
        this.etat= Reglage.PRELAVAGE;
        this.fonctionnement=false;
        this.etatHublot=true;
    }
    
    // Getters
    public int getConst(){
        return this.CONST;
    }

    @Override public Reglage getReglage(){
        return this.etat;
    }
    @Override public Boolean getFonctionnement(){
        return this.fonctionnement;
    }
  
    @Override public Boolean getEtatHublot(){
        return this.etatHublot ;
    }
  
    // Setters
    @Override public void setReglage(Reglage reglage){
        this.etat=reglage;
    }
    
    // Méthodes implémentant l'interface
    @Override
    public Boolean stopStart(){
        this.fonctionnement = !fonctionnement;
        return this.fonctionnement;
    }

    @Override public Boolean fermerHublot(){
        return this.etatHublot=false;
    }
    
    @Override public Boolean ouvrirHublot(){
        return this.etatHublot=true;
    }
}

// Classe principale
public class Interfaces {
    public static void main(String[] args) {
            MachineALaver mal = new MachineALaver();
            
            System.out.println("Constante : "+mal.getConst() );
            System.out.println("hublot ouvert : "+ mal.getEtatHublot());
            System.out.println("reglage : "+ mal.getReglage());
            
            mal.fermerHublot();
            System.out.println("hublot : "+ mal.getEtatHublot());
            
            mal.stopStart();
            System.out.println("fonctionnement : "+ mal.getFonctionnement());
            
            mal.setReglage(IMachineALaver.Reglage.LAVAGE);
            System.out.println(mal.getReglage());
            
            mal.setReglage(IMachineALaver.Reglage.SECHAGE);
            System.out.println(mal.getReglage());
    }
}