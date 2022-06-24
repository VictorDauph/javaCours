package cours_exercices.cours;



class Velo{
    //initialisation paramaètres classes
    private int nbRoue=2;
    
    public int getNbRoue(){
        return this.nbRoue;
    }
    
    public void setNbRoue(int nbRoue){
        this.nbRoue= nbRoue;
    }
    
    
    
}

public class Getters_Setters {
    public static void main(String[] args){
        Velo v = new Velo();
        System.out.println(v.getNbRoue());
        v.setNbRoue(8);
        System.out.println(v.getNbRoue());
    
    }
}