/**
 * Exercices methodes
 * 
 * 1. Definir une methode maximum(n1, n2, n3) qui renvoi le plus grand 
 * des 3 nombres n1, n2, n3 fourni en arguments
 * exemple : maximum(2, 15, 5) doit afficher : 15
 * 
 * 2. Ecrire une fonction cube qui retourne le cube de son argument.
 * Ecrire une fonction volumeSphere qui calcule le volume d’une sphère de rayon r
 * fourni en argument et qui utilise la fonction cube. 
 */

package cours_exercices.exercices.methodes;

// Classe principale

public class ExMethodes {
    // Méthode maximum
    public Integer Max(int a,int b,int c){
        if(a>b && a>c){
           return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else if(c>a && c>b){
            return c;
        }else{
            return null;
        }
    }
    
    // Méthode cube
    public int cube(int val){
        return val*val*val;
    }

    // Méthode volume
    public double volume(int r){
        return 4.0/3.0*3.14*cube(r);
    }

    // Méthode principale
    public static void main(String[] args) {
        ExMethodes m = new ExMethodes();
        System.out.println(m.Max(1,2,2));
        System.out.println(m.cube(2));
        System.out.println(m.volume(3));
    }
}
