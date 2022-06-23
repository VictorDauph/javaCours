/**
 * Exemple sur les boucles, continue et break
 */

package cours_exercices.cours;

// Classe principale
public class Boucles {
    public static void main(String[] args) {
	// Boucle for
        System.out.println("for");
	for (int cpt=0; cpt<3; cpt++){
            System.out.println(cpt);
        }
	// Saut de ligne
        System.out.println("do while");
	// Boucle do ... while
        int cpt=0;
        
        do{
            System.out.println(cpt);
            cpt++;
        }
        while(cpt <10);
        // Saut de ligne
        System.out.println("while");
        // Boucle while
        while(cpt !=0){
            // utilisation de continue
            if(cpt<8 && cpt>5){
                cpt--;
                continue;
            }
            System.out.println(cpt);
            cpt--;
            // Utilisation de break
            if(cpt==3){
                System.out.println(cpt);
                break;
            }
        }
            

            
	
        // Saut de ligne
	System.out.println("boucle intelligente");
        
        // Boucle "intelligente"
        Integer[] liste = {1,2,3};
        
        for (int element: liste){
            System.out.println(element);
            
        }
    }
}