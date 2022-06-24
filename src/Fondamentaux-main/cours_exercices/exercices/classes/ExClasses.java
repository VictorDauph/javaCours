/**
 * Exercices Classes
 * 
 * Créer une classe Voiture ayant les propriétés suivantes :
 * un identifiant, la marque, le modèle, la couleur, la vitesse maximum
 * et comme methodes : demarrer, rouler, stopper et arreter
 * mettre de message si la voiture est deja demarrer etc ...
 * puis dans la classe principale, declarer des objets de la classe Voiture
 * et faite les demarrer puis rouler, etc ...
 * Faire une methode infos qui donnera les informations sur l'objet et son etat.
 */

package cours_exercices.exercices.classes;

// classe voiture
class Voiture{
    // propriétés
    private final int id; //l'id est final car un id n'est pas censé changer.
    private String marque;
    private String modele;
    private String couleur;
    private int vMax;
    private Boolean running=false;
    
    // Getters
    public int getId(){
        return this.id;
    }
    
    public String getMarque(){
        return this.marque;
    }
    
    public String getModele(){
        return this.modele;
    }
    
    public String getCouleur(){
        return this.couleur;
    }
    
    public int getVMax(){
        return this.vMax;
    }
    
    public Boolean getRunning(){
        return this.running;
    }
    
    // Setters
    //L'id n'a pas de setter, car il est final et ne change jamais.
    
    public void setMarque(String marque){
        this.marque=marque;
    }
    
    public void setModele(String modele){
        this.modele=modele;
    }
    
    public void setCouleur(String couleur){
        this.couleur=couleur;
    }
    
    public void setVMax(int vMax){
        this.vMax=vMax;
    }
    

    // Constructeurs
    public Voiture(int id, String marque, String modele, String couleur, int vMax){
        this.id=id;
        this.setMarque(marque);
        this.setModele(modele);
        this.setCouleur(couleur);
        this.setVMax(vMax);
    }
    // Methodes de la classe
    public void start(){
        if (this.getRunning()){
            System.out.println("gné? la voiture "+this.id + " est déja démarrée.");
        }else{
            this.running=true;
            System.out.println("voiture "+this.id+ " démarrée");
        }
    }
    
    public void stop(){
        if (!this.getRunning()){
            System.out.println("gné? la voiture "+this.id+ " est déja stoppée.");
        }else{
            this.running=false;
            System.out.println("voiture "+this.id+ "  stoppée");
        }
    }
    
    public void info(){
        System.out.println("------------- infos "+this.id+" ----------------");
        System.out.println("id : "+this.id);
        System.out.println("marque : "+this.marque);
        System.out.println("modele : "+this.modele);
        System.out.println("couleur : "+this.couleur);
        System.out.println("running : "+this.running);
        System.out.println("-------------fin infos----------------");
    }
}

public class ExClasses {
    public static void main(String[] args) {
       // définitions des objets
       Voiture v= new Voiture(1,"Mercedes","Benz","noire",500);
       Voiture v2= new Voiture(2,"Delorean","DMC12","grise",88);
       // utilisation des objets
       v.start();
       v.start();
       v2.start();
       v2.stop();
       v2.stop();
       v.info();
       v2.info();
    }
}